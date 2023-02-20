package com.massage.massenger;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.massage.massenger.data.local.assets.CountryCodeRepository;
import com.massage.massenger.data.local.content.ContactDataSource;
import com.massage.massenger.data.local.content.ExternalStorageImageProvider;
import com.massage.massenger.data.local.pref.AppStartingStateDataSource;
import com.massage.massenger.data.local.pref.UserDataSource;
import com.massage.massenger.data.local.room.MessengerDatabase;
import com.massage.massenger.data.local.room.dao.ChatDao;
import com.massage.massenger.data.local.room.dao.GroupDao;
import com.massage.massenger.data.local.room.dao.MessageDao;
import com.massage.massenger.data.local.room.dao.UserDao;
import com.massage.massenger.data.remote.api_service.auth.AuthApiService;
import com.massage.massenger.data.remote.api_service.group.GroupApiService;
import com.massage.massenger.data.remote.api_service.user.UserApiService;
import com.massage.massenger.data.remote.socket.KtorSocket;
import com.massage.massenger.data.repository.AppStartingStateDataRepository;
import com.massage.massenger.data.repository.AuthRepository;
import com.massage.massenger.data.repository_impl.ChatRepositoryImpl;
import com.massage.massenger.data.repository_impl.GroupRepository;
import com.massage.massenger.data.repository_impl.MessageRepository;
import com.massage.massenger.data.repository_impl.UserRepository;
import com.massage.massenger.di.CacheModule;
import com.massage.massenger.di.DataStoreModule;
import com.massage.massenger.di.DataStoreModule_ProvideAppStateDataSourceFactory;
import com.massage.massenger.di.DataStoreModule_ProvidePreferenceDataStoreFactory;
import com.massage.massenger.di.DataStoreModule_ProvideUserDataSourceFactory;
import com.massage.massenger.di.DatabaseModule;
import com.massage.massenger.di.DatabaseModule_ProvideChatDaoFactory;
import com.massage.massenger.di.DatabaseModule_ProvideConnectionDaoFactory;
import com.massage.massenger.di.DatabaseModule_ProvideDatabaseFactory;
import com.massage.massenger.di.DatabaseModule_ProvideGroupDaoFactory;
import com.massage.massenger.di.DatabaseModule_ProvideMessageDaoFactory;
import com.massage.massenger.di.NetworkModule;
import com.massage.massenger.di.NetworkModule_ProvideAuthApiServiceFactory;
import com.massage.massenger.di.NetworkModule_ProvideGroupApiServiceFactory;
import com.massage.massenger.di.NetworkModule_ProvideHttpClientFactory;
import com.massage.massenger.di.NetworkModule_ProvideUserApiServiceFactory;
import com.massage.massenger.di.RepositoryModule;
import com.massage.massenger.di.RepositoryModule_ProvideAppStartingStateDataRepositoryFactory;
import com.massage.massenger.di.RepositoryModule_ProvideAuthRepositoryFactory;
import com.massage.massenger.presentation.messaging.contact_list.ContactScreenViewModel;
import com.massage.massenger.presentation.messaging.contact_list.ContactScreenViewModel_HiltModules_KeyModule_ProvideFactory;
import com.massage.massenger.presentation.messaging.create_group.CreateGroupViewModel;
import com.massage.massenger.presentation.messaging.create_group.CreateGroupViewModel_HiltModules_KeyModule_ProvideFactory;
import com.massage.massenger.presentation.messaging.image_gallery.ImageGridViewModel;
import com.massage.massenger.presentation.messaging.image_gallery.ImageGridViewModel_HiltModules_KeyModule_ProvideFactory;
import com.massage.massenger.presentation.messaging.image_view.ImageViewViewModel;
import com.massage.massenger.presentation.messaging.image_view.ImageViewViewModel_HiltModules_KeyModule_ProvideFactory;
import com.massage.massenger.presentation.messaging.on_boarding.OnBoardingViewModel;
import com.massage.massenger.presentation.messaging.on_boarding.OnBoardingViewModel_HiltModules_KeyModule_ProvideFactory;
import com.massage.massenger.presentation.messaging.sign_in.SignInViewModel;
import com.massage.massenger.presentation.messaging.sign_in.SignInViewModel_HiltModules_KeyModule_ProvideFactory;
import com.massage.massenger.presentation.messaging.sign_up.SignUpViewModel;
import com.massage.massenger.presentation.messaging.sign_up.SignUpViewModel_HiltModules_KeyModule_ProvideFactory;
import com.massage.massenger.presentation.messaging.single_chat.SingleChatViewModel;
import com.massage.massenger.presentation.messaging.single_chat.SingleChatViewModel_HiltModules_KeyModule_ProvideFactory;
import com.massage.massenger.presentation.messaging.video_play.VideosViewModel;
import com.massage.massenger.presentation.messaging.video_play.VideosViewModel_HiltModules_KeyModule_ProvideFactory;
import com.massage.massenger.presentation.ui.DataChannelActivity;
import com.massage.massenger.presentation.ui.DataChannelViewModel;
import com.massage.massenger.presentation.ui.DataChannelViewModel_HiltModules_KeyModule_ProvideFactory;
import com.massage.massenger.presentation.ui.MessagingActivity;
import com.massage.massenger.presentation.ui.MessagingActivityViewModel;
import com.massage.massenger.presentation.ui.MessagingActivityViewModel_HiltModules_KeyModule_ProvideFactory;
import com.massage.massenger.presentation.ui.RTCActivity;
import com.massage.massenger.presentation.ui.TabScreensViewModel;
import com.massage.massenger.presentation.ui.TabScreensViewModel_HiltModules_KeyModule_ProvideFactory;
import com.massage.massenger.service.IncomingMessageNotificationManager;
import com.massage.massenger.service.SocketMessageService;
import com.massage.massenger.service.SocketMessageService_MembersInjector;
import com.massage.massenger.unorganized.RTCViewModel;
import com.massage.massenger.unorganized.RTCViewModel_HiltModules_KeyModule_ProvideFactory;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.flags.HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_Lifecycle_Factory;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import io.ktor.client.HttpClient;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerMessengerApplication_HiltComponents_SingletonC extends MessengerApplication_HiltComponents.SingletonC {
  private final ApplicationContextModule applicationContextModule;

  private final DaggerMessengerApplication_HiltComponents_SingletonC singletonC = this;

  private Provider<DataStore<Preferences>> providePreferenceDataStoreProvider;

  private Provider<UserDataSource> provideUserDataSourceProvider;

  private Provider<MessengerDatabase> provideDatabaseProvider;

  private Provider<HttpClient> provideHttpClientProvider;

  private Provider<UserApiService> provideUserApiServiceProvider;

  private Provider<UserRepository> userRepositoryProvider;

  private Provider<AuthApiService> provideAuthApiServiceProvider;

  private Provider<AuthRepository> provideAuthRepositoryProvider;

  private Provider<GroupApiService> provideGroupApiServiceProvider;

  private Provider<GroupRepository> groupRepositoryProvider;

  private Provider<KtorSocket> ktorSocketProvider;

  private Provider<MessageRepository> messageRepositoryProvider;

  private Provider<AppStartingStateDataSource> provideAppStateDataSourceProvider;

  private Provider<AppStartingStateDataRepository> provideAppStartingStateDataRepositoryProvider;

  private Provider<ChatRepositoryImpl> chatRepositoryImplProvider;

  private DaggerMessengerApplication_HiltComponents_SingletonC(
      ApplicationContextModule applicationContextModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
    initialize(applicationContextModuleParam);

  }

  public static Builder builder() {
    return new Builder();
  }

  private UserDao userDao() {
    return DatabaseModule_ProvideConnectionDaoFactory.provideConnectionDao(provideDatabaseProvider.get());
  }

  private ContactDataSource contactDataSource() {
    return new ContactDataSource(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
  }

  private ChatDao chatDao() {
    return DatabaseModule_ProvideChatDaoFactory.provideChatDao(provideDatabaseProvider.get());
  }

  private GroupDao groupDao() {
    return DatabaseModule_ProvideGroupDaoFactory.provideGroupDao(provideDatabaseProvider.get());
  }

  private MessageDao messageDao() {
    return DatabaseModule_ProvideMessageDaoFactory.provideMessageDao(provideDatabaseProvider.get());
  }

  @SuppressWarnings("unchecked")
  private void initialize(final ApplicationContextModule applicationContextModuleParam) {
    this.providePreferenceDataStoreProvider = DoubleCheck.provider(new SwitchingProvider<DataStore<Preferences>>(singletonC, 2));
    this.provideUserDataSourceProvider = DoubleCheck.provider(new SwitchingProvider<UserDataSource>(singletonC, 1));
    this.provideDatabaseProvider = DoubleCheck.provider(new SwitchingProvider<MessengerDatabase>(singletonC, 3));
    this.provideHttpClientProvider = DoubleCheck.provider(new SwitchingProvider<HttpClient>(singletonC, 5));
    this.provideUserApiServiceProvider = DoubleCheck.provider(new SwitchingProvider<UserApiService>(singletonC, 4));
    this.userRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<UserRepository>(singletonC, 0));
    this.provideAuthApiServiceProvider = DoubleCheck.provider(new SwitchingProvider<AuthApiService>(singletonC, 7));
    this.provideAuthRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<AuthRepository>(singletonC, 6));
    this.provideGroupApiServiceProvider = DoubleCheck.provider(new SwitchingProvider<GroupApiService>(singletonC, 9));
    this.groupRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<GroupRepository>(singletonC, 8));
    this.ktorSocketProvider = DoubleCheck.provider(new SwitchingProvider<KtorSocket>(singletonC, 11));
    this.messageRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<MessageRepository>(singletonC, 10));
    this.provideAppStateDataSourceProvider = DoubleCheck.provider(new SwitchingProvider<AppStartingStateDataSource>(singletonC, 13));
    this.provideAppStartingStateDataRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<AppStartingStateDataRepository>(singletonC, 12));
    this.chatRepositoryImplProvider = DoubleCheck.provider(new SwitchingProvider<ChatRepositoryImpl>(singletonC, 14));
  }

  @Override
  public void injectMessengerApplication(MessengerApplication messengerApplication) {
  }

  @Override
  public Set<Boolean> getDisableFragmentGetContextFix() {
    return ImmutableSet.<Boolean>of();
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder(singletonC);
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder(singletonC);
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder cacheModule(CacheModule cacheModule) {
      Preconditions.checkNotNull(cacheModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder dataStoreModule(DataStoreModule dataStoreModule) {
      Preconditions.checkNotNull(dataStoreModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder databaseModule(DatabaseModule databaseModule) {
      Preconditions.checkNotNull(databaseModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule(
        HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule) {
      Preconditions.checkNotNull(hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder networkModule(NetworkModule networkModule) {
      Preconditions.checkNotNull(networkModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder repositoryModule(RepositoryModule repositoryModule) {
      Preconditions.checkNotNull(repositoryModule);
      return this;
    }

    public MessengerApplication_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new DaggerMessengerApplication_HiltComponents_SingletonC(applicationContextModule);
    }
  }

  private static final class ActivityRetainedCBuilder implements MessengerApplication_HiltComponents.ActivityRetainedC.Builder {
    private final DaggerMessengerApplication_HiltComponents_SingletonC singletonC;

    private ActivityRetainedCBuilder(
        DaggerMessengerApplication_HiltComponents_SingletonC singletonC) {
      this.singletonC = singletonC;
    }

    @Override
    public MessengerApplication_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl(singletonC);
    }
  }

  private static final class ActivityCBuilder implements MessengerApplication_HiltComponents.ActivityC.Builder {
    private final DaggerMessengerApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private Activity activity;

    private ActivityCBuilder(DaggerMessengerApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ActivityCBuilder activity(Activity activity) {
      this.activity = Preconditions.checkNotNull(activity);
      return this;
    }

    @Override
    public MessengerApplication_HiltComponents.ActivityC build() {
      Preconditions.checkBuilderRequirement(activity, Activity.class);
      return new ActivityCImpl(singletonC, activityRetainedCImpl, activity);
    }
  }

  private static final class FragmentCBuilder implements MessengerApplication_HiltComponents.FragmentC.Builder {
    private final DaggerMessengerApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private Fragment fragment;

    private FragmentCBuilder(DaggerMessengerApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public FragmentCBuilder fragment(Fragment fragment) {
      this.fragment = Preconditions.checkNotNull(fragment);
      return this;
    }

    @Override
    public MessengerApplication_HiltComponents.FragmentC build() {
      Preconditions.checkBuilderRequirement(fragment, Fragment.class);
      return new FragmentCImpl(singletonC, activityRetainedCImpl, activityCImpl, fragment);
    }
  }

  private static final class ViewWithFragmentCBuilder implements MessengerApplication_HiltComponents.ViewWithFragmentC.Builder {
    private final DaggerMessengerApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private View view;

    private ViewWithFragmentCBuilder(
        DaggerMessengerApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;
    }

    @Override
    public ViewWithFragmentCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public MessengerApplication_HiltComponents.ViewWithFragmentC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewWithFragmentCImpl(singletonC, activityRetainedCImpl, activityCImpl, fragmentCImpl, view);
    }
  }

  private static final class ViewCBuilder implements MessengerApplication_HiltComponents.ViewC.Builder {
    private final DaggerMessengerApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private View view;

    private ViewCBuilder(DaggerMessengerApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public ViewCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public MessengerApplication_HiltComponents.ViewC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewCImpl(singletonC, activityRetainedCImpl, activityCImpl, view);
    }
  }

  private static final class ViewModelCBuilder implements MessengerApplication_HiltComponents.ViewModelC.Builder {
    private final DaggerMessengerApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private SavedStateHandle savedStateHandle;

    private ViewModelCBuilder(DaggerMessengerApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
      this.savedStateHandle = Preconditions.checkNotNull(handle);
      return this;
    }

    @Override
    public MessengerApplication_HiltComponents.ViewModelC build() {
      Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
      return new ViewModelCImpl(singletonC, activityRetainedCImpl, savedStateHandle);
    }
  }

  private static final class ServiceCBuilder implements MessengerApplication_HiltComponents.ServiceC.Builder {
    private final DaggerMessengerApplication_HiltComponents_SingletonC singletonC;

    private Service service;

    private ServiceCBuilder(DaggerMessengerApplication_HiltComponents_SingletonC singletonC) {
      this.singletonC = singletonC;
    }

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public MessengerApplication_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(singletonC, service);
    }
  }

  private static final class ViewWithFragmentCImpl extends MessengerApplication_HiltComponents.ViewWithFragmentC {
    private final DaggerMessengerApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private final ViewWithFragmentCImpl viewWithFragmentCImpl = this;

    private ViewWithFragmentCImpl(DaggerMessengerApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl, View viewParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;


    }
  }

  private static final class FragmentCImpl extends MessengerApplication_HiltComponents.FragmentC {
    private final DaggerMessengerApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl = this;

    private FragmentCImpl(DaggerMessengerApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        Fragment fragmentParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return activityCImpl.getHiltInternalFactoryFactory();
    }

    @Override
    public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
      return new ViewWithFragmentCBuilder(singletonC, activityRetainedCImpl, activityCImpl, fragmentCImpl);
    }
  }

  private static final class ViewCImpl extends MessengerApplication_HiltComponents.ViewC {
    private final DaggerMessengerApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final ViewCImpl viewCImpl = this;

    private ViewCImpl(DaggerMessengerApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl, View viewParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }
  }

  private static final class ActivityCImpl extends MessengerApplication_HiltComponents.ActivityC {
    private final DaggerMessengerApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl = this;

    private ActivityCImpl(DaggerMessengerApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, Activity activityParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;


    }

    @Override
    public void injectDataChannelActivity(DataChannelActivity dataChannelActivity) {
    }

    @Override
    public void injectMessagingActivity(MessagingActivity messagingActivity) {
    }

    @Override
    public void injectRTCActivity(RTCActivity rTCActivity) {
    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonC.applicationContextModule), getViewModelKeys(), new ViewModelCBuilder(singletonC, activityRetainedCImpl));
    }

    @Override
    public Set<String> getViewModelKeys() {
      return ImmutableSet.<String>of(ContactScreenViewModel_HiltModules_KeyModule_ProvideFactory.provide(), CreateGroupViewModel_HiltModules_KeyModule_ProvideFactory.provide(), DataChannelViewModel_HiltModules_KeyModule_ProvideFactory.provide(), ImageGridViewModel_HiltModules_KeyModule_ProvideFactory.provide(), ImageViewViewModel_HiltModules_KeyModule_ProvideFactory.provide(), MessagingActivityViewModel_HiltModules_KeyModule_ProvideFactory.provide(), OnBoardingViewModel_HiltModules_KeyModule_ProvideFactory.provide(), RTCViewModel_HiltModules_KeyModule_ProvideFactory.provide(), SignInViewModel_HiltModules_KeyModule_ProvideFactory.provide(), SignUpViewModel_HiltModules_KeyModule_ProvideFactory.provide(), SingleChatViewModel_HiltModules_KeyModule_ProvideFactory.provide(), TabScreensViewModel_HiltModules_KeyModule_ProvideFactory.provide(), VideosViewModel_HiltModules_KeyModule_ProvideFactory.provide());
    }

    @Override
    public ViewModelComponentBuilder getViewModelComponentBuilder() {
      return new ViewModelCBuilder(singletonC, activityRetainedCImpl);
    }

    @Override
    public FragmentComponentBuilder fragmentComponentBuilder() {
      return new FragmentCBuilder(singletonC, activityRetainedCImpl, activityCImpl);
    }

    @Override
    public ViewComponentBuilder viewComponentBuilder() {
      return new ViewCBuilder(singletonC, activityRetainedCImpl, activityCImpl);
    }
  }

  private static final class ViewModelCImpl extends MessengerApplication_HiltComponents.ViewModelC {
    private final SavedStateHandle savedStateHandle;

    private final DaggerMessengerApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ViewModelCImpl viewModelCImpl = this;

    private Provider<ContactScreenViewModel> contactScreenViewModelProvider;

    private Provider<CreateGroupViewModel> createGroupViewModelProvider;

    private Provider<DataChannelViewModel> dataChannelViewModelProvider;

    private Provider<ImageGridViewModel> imageGridViewModelProvider;

    private Provider<ImageViewViewModel> imageViewViewModelProvider;

    private Provider<MessagingActivityViewModel> messagingActivityViewModelProvider;

    private Provider<OnBoardingViewModel> onBoardingViewModelProvider;

    private Provider<RTCViewModel> rTCViewModelProvider;

    private Provider<SignInViewModel> signInViewModelProvider;

    private Provider<SignUpViewModel> signUpViewModelProvider;

    private Provider<SingleChatViewModel> singleChatViewModelProvider;

    private Provider<TabScreensViewModel> tabScreensViewModelProvider;

    private Provider<VideosViewModel> videosViewModelProvider;

    private ViewModelCImpl(DaggerMessengerApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, SavedStateHandle savedStateHandleParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.savedStateHandle = savedStateHandleParam;
      initialize(savedStateHandleParam);

    }

    private ExternalStorageImageProvider externalStorageImageProvider() {
      return new ExternalStorageImageProvider(ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule));
    }

    private CountryCodeRepository countryCodeRepository() {
      return new CountryCodeRepository(ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule));
    }

    @SuppressWarnings("unchecked")
    private void initialize(final SavedStateHandle savedStateHandleParam) {
      this.contactScreenViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 0);
      this.createGroupViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 1);
      this.dataChannelViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 2);
      this.imageGridViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 3);
      this.imageViewViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 4);
      this.messagingActivityViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 5);
      this.onBoardingViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 6);
      this.rTCViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 7);
      this.signInViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 8);
      this.signUpViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 9);
      this.singleChatViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 10);
      this.tabScreensViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 11);
      this.videosViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 12);
    }

    @Override
    public Map<String, Provider<ViewModel>> getHiltViewModelMap() {
      return ImmutableMap.<String, Provider<ViewModel>>builderWithExpectedSize(13).put("com.massage.massenger.presentation.messaging.contact_list.ContactScreenViewModel", (Provider) contactScreenViewModelProvider).put("com.massage.massenger.presentation.messaging.create_group.CreateGroupViewModel", (Provider) createGroupViewModelProvider).put("com.massage.massenger.presentation.ui.DataChannelViewModel", (Provider) dataChannelViewModelProvider).put("com.massage.massenger.presentation.messaging.image_gallery.ImageGridViewModel", (Provider) imageGridViewModelProvider).put("com.massage.massenger.presentation.messaging.image_view.ImageViewViewModel", (Provider) imageViewViewModelProvider).put("com.massage.massenger.presentation.ui.MessagingActivityViewModel", (Provider) messagingActivityViewModelProvider).put("com.massage.massenger.presentation.messaging.on_boarding.OnBoardingViewModel", (Provider) onBoardingViewModelProvider).put("com.massage.massenger.unorganized.RTCViewModel", (Provider) rTCViewModelProvider).put("com.massage.massenger.presentation.messaging.sign_in.SignInViewModel", (Provider) signInViewModelProvider).put("com.massage.massenger.presentation.messaging.sign_up.SignUpViewModel", (Provider) signUpViewModelProvider).put("com.massage.massenger.presentation.messaging.single_chat.SingleChatViewModel", (Provider) singleChatViewModelProvider).put("com.massage.massenger.presentation.ui.TabScreensViewModel", (Provider) tabScreensViewModelProvider).put("com.massage.massenger.presentation.messaging.video_play.VideosViewModel", (Provider) videosViewModelProvider).build();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final DaggerMessengerApplication_HiltComponents_SingletonC singletonC;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final ViewModelCImpl viewModelCImpl;

      private final int id;

      SwitchingProvider(DaggerMessengerApplication_HiltComponents_SingletonC singletonC,
          ActivityRetainedCImpl activityRetainedCImpl, ViewModelCImpl viewModelCImpl, int id) {
        this.singletonC = singletonC;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.viewModelCImpl = viewModelCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // com.massage.massenger.presentation.messaging.contact_list.ContactScreenViewModel 
          return (T) new ContactScreenViewModel(singletonC.userRepositoryProvider.get(), singletonC.provideAuthRepositoryProvider.get());

          case 1: // com.massage.massenger.presentation.messaging.create_group.CreateGroupViewModel 
          return (T) new CreateGroupViewModel(singletonC.userRepositoryProvider.get(), singletonC.groupRepositoryProvider.get(), singletonC.provideAuthRepositoryProvider.get());

          case 2: // com.massage.massenger.presentation.ui.DataChannelViewModel 
          return (T) new DataChannelViewModel(singletonC.provideAuthRepositoryProvider.get(), singletonC.messageRepositoryProvider.get(), viewModelCImpl.savedStateHandle, ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule));

          case 3: // com.massage.massenger.presentation.messaging.image_gallery.ImageGridViewModel 
          return (T) new ImageGridViewModel(viewModelCImpl.externalStorageImageProvider());

          case 4: // com.massage.massenger.presentation.messaging.image_view.ImageViewViewModel 
          return (T) new ImageViewViewModel(viewModelCImpl.externalStorageImageProvider());

          case 5: // com.massage.massenger.presentation.ui.MessagingActivityViewModel 
          return (T) new MessagingActivityViewModel(singletonC.provideAppStartingStateDataRepositoryProvider.get());

          case 6: // com.massage.massenger.presentation.messaging.on_boarding.OnBoardingViewModel 
          return (T) new OnBoardingViewModel(singletonC.provideAppStartingStateDataRepositoryProvider.get());

          case 7: // com.massage.massenger.unorganized.RTCViewModel 
          return (T) new RTCViewModel(singletonC.messageRepositoryProvider.get(), singletonC.provideAuthRepositoryProvider.get(), viewModelCImpl.savedStateHandle);

          case 8: // com.massage.massenger.presentation.messaging.sign_in.SignInViewModel 
          return (T) new SignInViewModel(singletonC.provideAuthRepositoryProvider.get(), viewModelCImpl.countryCodeRepository(), singletonC.provideAppStartingStateDataRepositoryProvider.get());

          case 9: // com.massage.massenger.presentation.messaging.sign_up.SignUpViewModel 
          return (T) new SignUpViewModel(singletonC.provideAuthRepositoryProvider.get(), viewModelCImpl.countryCodeRepository(), singletonC.provideAppStartingStateDataRepositoryProvider.get());

          case 10: // com.massage.massenger.presentation.messaging.single_chat.SingleChatViewModel 
          return (T) new SingleChatViewModel(singletonC.provideAuthRepositoryProvider.get(), singletonC.messageRepositoryProvider.get(), singletonC.chatRepositoryImplProvider.get(), singletonC.groupRepositoryProvider.get(), singletonC.userRepositoryProvider.get(), viewModelCImpl.externalStorageImageProvider());

          case 11: // com.massage.massenger.presentation.ui.TabScreensViewModel 
          return (T) new TabScreensViewModel(singletonC.chatDao(), singletonC.provideAuthRepositoryProvider.get(), singletonC.userRepositoryProvider.get());

          case 12: // com.massage.massenger.presentation.messaging.video_play.VideosViewModel 
          return (T) new VideosViewModel();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ActivityRetainedCImpl extends MessengerApplication_HiltComponents.ActivityRetainedC {
    private final DaggerMessengerApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl = this;

    @SuppressWarnings("rawtypes")
    private Provider lifecycleProvider;

    private ActivityRetainedCImpl(DaggerMessengerApplication_HiltComponents_SingletonC singletonC) {
      this.singletonC = singletonC;

      initialize();

    }

    @SuppressWarnings("unchecked")
    private void initialize() {
      this.lifecycleProvider = DoubleCheck.provider(new SwitchingProvider<Object>(singletonC, activityRetainedCImpl, 0));
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder(singletonC, activityRetainedCImpl);
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return (ActivityRetainedLifecycle) lifecycleProvider.get();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final DaggerMessengerApplication_HiltComponents_SingletonC singletonC;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final int id;

      SwitchingProvider(DaggerMessengerApplication_HiltComponents_SingletonC singletonC,
          ActivityRetainedCImpl activityRetainedCImpl, int id) {
        this.singletonC = singletonC;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.Lifecycle 
          return (T) ActivityRetainedComponentManager_Lifecycle_Factory.newInstance();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ServiceCImpl extends MessengerApplication_HiltComponents.ServiceC {
    private final DaggerMessengerApplication_HiltComponents_SingletonC singletonC;

    private final ServiceCImpl serviceCImpl = this;

    private ServiceCImpl(DaggerMessengerApplication_HiltComponents_SingletonC singletonC,
        Service serviceParam) {
      this.singletonC = singletonC;


    }

    private IncomingMessageNotificationManager incomingMessageNotificationManager() {
      return new IncomingMessageNotificationManager(ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule));
    }

    @Override
    public void injectSocketMessageService(SocketMessageService socketMessageService) {
      injectSocketMessageService2(socketMessageService);
    }

    private SocketMessageService injectSocketMessageService2(SocketMessageService instance) {
      SocketMessageService_MembersInjector.injectMessageRepository(instance, singletonC.messageRepositoryProvider.get());
      SocketMessageService_MembersInjector.injectMessageNotificationManager(instance, incomingMessageNotificationManager());
      return instance;
    }
  }

  private static final class SwitchingProvider<T> implements Provider<T> {
    private final DaggerMessengerApplication_HiltComponents_SingletonC singletonC;

    private final int id;

    SwitchingProvider(DaggerMessengerApplication_HiltComponents_SingletonC singletonC, int id) {
      this.singletonC = singletonC;
      this.id = id;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get() {
      switch (id) {
        case 0: // com.massage.massenger.data.repository_impl.UserRepository 
        return (T) new UserRepository(singletonC.provideUserDataSourceProvider.get(), singletonC.userDao(), singletonC.provideUserApiServiceProvider.get(), singletonC.contactDataSource());

        case 1: // com.massage.massenger.data.local.pref.UserDataSource 
        return (T) DataStoreModule_ProvideUserDataSourceFactory.provideUserDataSource(singletonC.providePreferenceDataStoreProvider.get());

        case 2: // androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> 
        return (T) DataStoreModule_ProvidePreferenceDataStoreFactory.providePreferenceDataStore(ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule));

        case 3: // com.massage.massenger.data.local.room.MessengerDatabase 
        return (T) DatabaseModule_ProvideDatabaseFactory.provideDatabase(ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonC.applicationContextModule));

        case 4: // com.massage.massenger.data.remote.api_service.user.UserApiService 
        return (T) NetworkModule_ProvideUserApiServiceFactory.provideUserApiService(singletonC.provideHttpClientProvider.get());

        case 5: // io.ktor.client.HttpClient 
        return (T) NetworkModule_ProvideHttpClientFactory.provideHttpClient();

        case 6: // com.massage.massenger.data.repository.AuthRepository 
        return (T) RepositoryModule_ProvideAuthRepositoryFactory.provideAuthRepository(singletonC.provideAuthApiServiceProvider.get(), singletonC.provideUserDataSourceProvider.get(), singletonC.provideDatabaseProvider.get());

        case 7: // com.massage.massenger.data.remote.api_service.auth.AuthApiService 
        return (T) NetworkModule_ProvideAuthApiServiceFactory.provideAuthApiService(singletonC.provideHttpClientProvider.get());

        case 8: // com.massage.massenger.data.repository_impl.GroupRepository 
        return (T) new GroupRepository(singletonC.provideUserDataSourceProvider.get(), singletonC.provideGroupApiServiceProvider.get(), singletonC.chatDao(), singletonC.groupDao());

        case 9: // com.massage.massenger.data.remote.api_service.group.GroupApiService 
        return (T) NetworkModule_ProvideGroupApiServiceFactory.provideGroupApiService(singletonC.provideHttpClientProvider.get());

        case 10: // com.massage.massenger.data.repository_impl.MessageRepository 
        return (T) new MessageRepository(singletonC.messageDao(), singletonC.chatDao(), singletonC.userDao(), singletonC.ktorSocketProvider.get());

        case 11: // com.massage.massenger.data.remote.socket.KtorSocket 
        return (T) new KtorSocket(singletonC.provideUserDataSourceProvider.get());

        case 12: // com.massage.massenger.data.repository.AppStartingStateDataRepository 
        return (T) RepositoryModule_ProvideAppStartingStateDataRepositoryFactory.provideAppStartingStateDataRepository(singletonC.provideAppStateDataSourceProvider.get());

        case 13: // com.massage.massenger.data.local.pref.AppStartingStateDataSource 
        return (T) DataStoreModule_ProvideAppStateDataSourceFactory.provideAppStateDataSource(singletonC.providePreferenceDataStoreProvider.get());

        case 14: // com.massage.massenger.data.repository_impl.ChatRepositoryImpl 
        return (T) new ChatRepositoryImpl(singletonC.chatDao());

        default: throw new AssertionError(id);
      }
    }
  }
}

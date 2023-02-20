package com.massage.massenger.presentation.ui;

import com.massage.massenger.data.local.room.dao.ChatDao;
import com.massage.massenger.data.repository.AuthRepository;
import com.massage.massenger.data.repository_impl.UserRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class TabScreensViewModel_Factory implements Factory<TabScreensViewModel> {
  private final Provider<ChatDao> chatDaoProvider;

  private final Provider<AuthRepository> authRepositoryProvider;

  private final Provider<UserRepository> userRepositoryProvider;

  public TabScreensViewModel_Factory(Provider<ChatDao> chatDaoProvider,
      Provider<AuthRepository> authRepositoryProvider,
      Provider<UserRepository> userRepositoryProvider) {
    this.chatDaoProvider = chatDaoProvider;
    this.authRepositoryProvider = authRepositoryProvider;
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public TabScreensViewModel get() {
    return newInstance(chatDaoProvider.get(), authRepositoryProvider.get(), userRepositoryProvider.get());
  }

  public static TabScreensViewModel_Factory create(Provider<ChatDao> chatDaoProvider,
      Provider<AuthRepository> authRepositoryProvider,
      Provider<UserRepository> userRepositoryProvider) {
    return new TabScreensViewModel_Factory(chatDaoProvider, authRepositoryProvider, userRepositoryProvider);
  }

  public static TabScreensViewModel newInstance(ChatDao chatDao, AuthRepository authRepository,
      UserRepository userRepository) {
    return new TabScreensViewModel(chatDao, authRepository, userRepository);
  }
}

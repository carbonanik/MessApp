package com.massage.massenger.presentation.ui;

import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.massage.massenger.data.repository.AuthRepository;
import com.massage.massenger.data.repository_impl.MessageRepository;
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
public final class DataChannelViewModel_Factory implements Factory<DataChannelViewModel> {
  private final Provider<AuthRepository> authRepositoryProvider;

  private final Provider<MessageRepository> messageRepositoryProvider;

  private final Provider<SavedStateHandle> savedStateHandleProvider;

  private final Provider<Context> contextProvider;

  public DataChannelViewModel_Factory(Provider<AuthRepository> authRepositoryProvider,
      Provider<MessageRepository> messageRepositoryProvider,
      Provider<SavedStateHandle> savedStateHandleProvider, Provider<Context> contextProvider) {
    this.authRepositoryProvider = authRepositoryProvider;
    this.messageRepositoryProvider = messageRepositoryProvider;
    this.savedStateHandleProvider = savedStateHandleProvider;
    this.contextProvider = contextProvider;
  }

  @Override
  public DataChannelViewModel get() {
    return newInstance(authRepositoryProvider.get(), messageRepositoryProvider.get(), savedStateHandleProvider.get(), contextProvider.get());
  }

  public static DataChannelViewModel_Factory create(Provider<AuthRepository> authRepositoryProvider,
      Provider<MessageRepository> messageRepositoryProvider,
      Provider<SavedStateHandle> savedStateHandleProvider, Provider<Context> contextProvider) {
    return new DataChannelViewModel_Factory(authRepositoryProvider, messageRepositoryProvider, savedStateHandleProvider, contextProvider);
  }

  public static DataChannelViewModel newInstance(AuthRepository authRepository,
      MessageRepository messageRepository, SavedStateHandle savedStateHandle, Context context) {
    return new DataChannelViewModel(authRepository, messageRepository, savedStateHandle, context);
  }
}

package com.massage.massenger.unorganized;

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
public final class RTCViewModel_Factory implements Factory<RTCViewModel> {
  private final Provider<MessageRepository> messageRepositoryProvider;

  private final Provider<AuthRepository> authRepositoryProvider;

  private final Provider<SavedStateHandle> savedStateHandleProvider;

  public RTCViewModel_Factory(Provider<MessageRepository> messageRepositoryProvider,
      Provider<AuthRepository> authRepositoryProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    this.messageRepositoryProvider = messageRepositoryProvider;
    this.authRepositoryProvider = authRepositoryProvider;
    this.savedStateHandleProvider = savedStateHandleProvider;
  }

  @Override
  public RTCViewModel get() {
    return newInstance(messageRepositoryProvider.get(), authRepositoryProvider.get(), savedStateHandleProvider.get());
  }

  public static RTCViewModel_Factory create(Provider<MessageRepository> messageRepositoryProvider,
      Provider<AuthRepository> authRepositoryProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    return new RTCViewModel_Factory(messageRepositoryProvider, authRepositoryProvider, savedStateHandleProvider);
  }

  public static RTCViewModel newInstance(MessageRepository messageRepository,
      AuthRepository authRepository, SavedStateHandle savedStateHandle) {
    return new RTCViewModel(messageRepository, authRepository, savedStateHandle);
  }
}

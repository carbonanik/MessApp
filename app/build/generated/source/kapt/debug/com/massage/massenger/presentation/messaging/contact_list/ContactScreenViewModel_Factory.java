package com.massage.massenger.presentation.messaging.contact_list;

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
public final class ContactScreenViewModel_Factory implements Factory<ContactScreenViewModel> {
  private final Provider<UserRepository> userRepositoryProvider;

  private final Provider<AuthRepository> authRepositoryProvider;

  public ContactScreenViewModel_Factory(Provider<UserRepository> userRepositoryProvider,
      Provider<AuthRepository> authRepositoryProvider) {
    this.userRepositoryProvider = userRepositoryProvider;
    this.authRepositoryProvider = authRepositoryProvider;
  }

  @Override
  public ContactScreenViewModel get() {
    return newInstance(userRepositoryProvider.get(), authRepositoryProvider.get());
  }

  public static ContactScreenViewModel_Factory create(
      Provider<UserRepository> userRepositoryProvider,
      Provider<AuthRepository> authRepositoryProvider) {
    return new ContactScreenViewModel_Factory(userRepositoryProvider, authRepositoryProvider);
  }

  public static ContactScreenViewModel newInstance(UserRepository userRepository,
      AuthRepository authRepository) {
    return new ContactScreenViewModel(userRepository, authRepository);
  }
}

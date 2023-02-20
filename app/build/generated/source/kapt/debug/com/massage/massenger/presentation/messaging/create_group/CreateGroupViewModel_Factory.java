package com.massage.massenger.presentation.messaging.create_group;

import com.massage.massenger.data.repository.AuthRepository;
import com.massage.massenger.data.repository_impl.GroupRepository;
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
public final class CreateGroupViewModel_Factory implements Factory<CreateGroupViewModel> {
  private final Provider<UserRepository> userRepositoryProvider;

  private final Provider<GroupRepository> groupRepositoryProvider;

  private final Provider<AuthRepository> authRepositoryProvider;

  public CreateGroupViewModel_Factory(Provider<UserRepository> userRepositoryProvider,
      Provider<GroupRepository> groupRepositoryProvider,
      Provider<AuthRepository> authRepositoryProvider) {
    this.userRepositoryProvider = userRepositoryProvider;
    this.groupRepositoryProvider = groupRepositoryProvider;
    this.authRepositoryProvider = authRepositoryProvider;
  }

  @Override
  public CreateGroupViewModel get() {
    return newInstance(userRepositoryProvider.get(), groupRepositoryProvider.get(), authRepositoryProvider.get());
  }

  public static CreateGroupViewModel_Factory create(Provider<UserRepository> userRepositoryProvider,
      Provider<GroupRepository> groupRepositoryProvider,
      Provider<AuthRepository> authRepositoryProvider) {
    return new CreateGroupViewModel_Factory(userRepositoryProvider, groupRepositoryProvider, authRepositoryProvider);
  }

  public static CreateGroupViewModel newInstance(UserRepository userRepository,
      GroupRepository groupRepository, AuthRepository authRepository) {
    return new CreateGroupViewModel(userRepository, groupRepository, authRepository);
  }
}

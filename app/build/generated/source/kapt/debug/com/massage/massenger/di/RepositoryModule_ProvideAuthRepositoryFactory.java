package com.massage.massenger.di;

import com.massage.massenger.data.local.pref.UserDataSource;
import com.massage.massenger.data.local.room.MessengerDatabase;
import com.massage.massenger.data.remote.api_service.auth.AuthApiService;
import com.massage.massenger.data.repository.AuthRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class RepositoryModule_ProvideAuthRepositoryFactory implements Factory<AuthRepository> {
  private final Provider<AuthApiService> authApiServiceProvider;

  private final Provider<UserDataSource> userDataSourceProvider;

  private final Provider<MessengerDatabase> databaseProvider;

  public RepositoryModule_ProvideAuthRepositoryFactory(
      Provider<AuthApiService> authApiServiceProvider,
      Provider<UserDataSource> userDataSourceProvider,
      Provider<MessengerDatabase> databaseProvider) {
    this.authApiServiceProvider = authApiServiceProvider;
    this.userDataSourceProvider = userDataSourceProvider;
    this.databaseProvider = databaseProvider;
  }

  @Override
  public AuthRepository get() {
    return provideAuthRepository(authApiServiceProvider.get(), userDataSourceProvider.get(), databaseProvider.get());
  }

  public static RepositoryModule_ProvideAuthRepositoryFactory create(
      Provider<AuthApiService> authApiServiceProvider,
      Provider<UserDataSource> userDataSourceProvider,
      Provider<MessengerDatabase> databaseProvider) {
    return new RepositoryModule_ProvideAuthRepositoryFactory(authApiServiceProvider, userDataSourceProvider, databaseProvider);
  }

  public static AuthRepository provideAuthRepository(AuthApiService authApiService,
      UserDataSource userDataSource, MessengerDatabase database) {
    return Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideAuthRepository(authApiService, userDataSource, database));
  }
}

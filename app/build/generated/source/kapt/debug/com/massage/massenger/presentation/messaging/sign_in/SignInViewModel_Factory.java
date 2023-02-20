package com.massage.massenger.presentation.messaging.sign_in;

import com.massage.massenger.data.local.assets.CountryCodeRepository;
import com.massage.massenger.data.repository.AppStartingStateDataRepository;
import com.massage.massenger.data.repository.AuthRepository;
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
public final class SignInViewModel_Factory implements Factory<SignInViewModel> {
  private final Provider<AuthRepository> authRepositoryProvider;

  private final Provider<CountryCodeRepository> countriesRepositoryProvider;

  private final Provider<AppStartingStateDataRepository> appStartingStateDataRepositoryProvider;

  public SignInViewModel_Factory(Provider<AuthRepository> authRepositoryProvider,
      Provider<CountryCodeRepository> countriesRepositoryProvider,
      Provider<AppStartingStateDataRepository> appStartingStateDataRepositoryProvider) {
    this.authRepositoryProvider = authRepositoryProvider;
    this.countriesRepositoryProvider = countriesRepositoryProvider;
    this.appStartingStateDataRepositoryProvider = appStartingStateDataRepositoryProvider;
  }

  @Override
  public SignInViewModel get() {
    return newInstance(authRepositoryProvider.get(), countriesRepositoryProvider.get(), appStartingStateDataRepositoryProvider.get());
  }

  public static SignInViewModel_Factory create(Provider<AuthRepository> authRepositoryProvider,
      Provider<CountryCodeRepository> countriesRepositoryProvider,
      Provider<AppStartingStateDataRepository> appStartingStateDataRepositoryProvider) {
    return new SignInViewModel_Factory(authRepositoryProvider, countriesRepositoryProvider, appStartingStateDataRepositoryProvider);
  }

  public static SignInViewModel newInstance(AuthRepository authRepository,
      CountryCodeRepository countriesRepository,
      AppStartingStateDataRepository appStartingStateDataRepository) {
    return new SignInViewModel(authRepository, countriesRepository, appStartingStateDataRepository);
  }
}

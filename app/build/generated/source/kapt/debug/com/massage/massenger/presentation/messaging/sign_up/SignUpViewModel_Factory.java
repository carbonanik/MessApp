package com.massage.massenger.presentation.messaging.sign_up;

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
public final class SignUpViewModel_Factory implements Factory<SignUpViewModel> {
  private final Provider<AuthRepository> authRepositoryProvider;

  private final Provider<CountryCodeRepository> countriesRepositoryProvider;

  private final Provider<AppStartingStateDataRepository> appStartingStateDataRepositoryProvider;

  public SignUpViewModel_Factory(Provider<AuthRepository> authRepositoryProvider,
      Provider<CountryCodeRepository> countriesRepositoryProvider,
      Provider<AppStartingStateDataRepository> appStartingStateDataRepositoryProvider) {
    this.authRepositoryProvider = authRepositoryProvider;
    this.countriesRepositoryProvider = countriesRepositoryProvider;
    this.appStartingStateDataRepositoryProvider = appStartingStateDataRepositoryProvider;
  }

  @Override
  public SignUpViewModel get() {
    return newInstance(authRepositoryProvider.get(), countriesRepositoryProvider.get(), appStartingStateDataRepositoryProvider.get());
  }

  public static SignUpViewModel_Factory create(Provider<AuthRepository> authRepositoryProvider,
      Provider<CountryCodeRepository> countriesRepositoryProvider,
      Provider<AppStartingStateDataRepository> appStartingStateDataRepositoryProvider) {
    return new SignUpViewModel_Factory(authRepositoryProvider, countriesRepositoryProvider, appStartingStateDataRepositoryProvider);
  }

  public static SignUpViewModel newInstance(AuthRepository authRepository,
      CountryCodeRepository countriesRepository,
      AppStartingStateDataRepository appStartingStateDataRepository) {
    return new SignUpViewModel(authRepository, countriesRepository, appStartingStateDataRepository);
  }
}

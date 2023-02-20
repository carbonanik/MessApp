package com.massage.massenger.presentation.messaging.on_boarding;

import com.massage.massenger.data.repository.AppStartingStateDataRepository;
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
public final class OnBoardingViewModel_Factory implements Factory<OnBoardingViewModel> {
  private final Provider<AppStartingStateDataRepository> appStartingStateDataRepositoryProvider;

  public OnBoardingViewModel_Factory(
      Provider<AppStartingStateDataRepository> appStartingStateDataRepositoryProvider) {
    this.appStartingStateDataRepositoryProvider = appStartingStateDataRepositoryProvider;
  }

  @Override
  public OnBoardingViewModel get() {
    return newInstance(appStartingStateDataRepositoryProvider.get());
  }

  public static OnBoardingViewModel_Factory create(
      Provider<AppStartingStateDataRepository> appStartingStateDataRepositoryProvider) {
    return new OnBoardingViewModel_Factory(appStartingStateDataRepositoryProvider);
  }

  public static OnBoardingViewModel newInstance(
      AppStartingStateDataRepository appStartingStateDataRepository) {
    return new OnBoardingViewModel(appStartingStateDataRepository);
  }
}

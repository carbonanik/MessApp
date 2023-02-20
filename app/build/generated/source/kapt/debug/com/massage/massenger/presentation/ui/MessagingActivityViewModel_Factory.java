package com.massage.massenger.presentation.ui;

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
public final class MessagingActivityViewModel_Factory implements Factory<MessagingActivityViewModel> {
  private final Provider<AppStartingStateDataRepository> appStartingStateDataRepositoryProvider;

  public MessagingActivityViewModel_Factory(
      Provider<AppStartingStateDataRepository> appStartingStateDataRepositoryProvider) {
    this.appStartingStateDataRepositoryProvider = appStartingStateDataRepositoryProvider;
  }

  @Override
  public MessagingActivityViewModel get() {
    return newInstance(appStartingStateDataRepositoryProvider.get());
  }

  public static MessagingActivityViewModel_Factory create(
      Provider<AppStartingStateDataRepository> appStartingStateDataRepositoryProvider) {
    return new MessagingActivityViewModel_Factory(appStartingStateDataRepositoryProvider);
  }

  public static MessagingActivityViewModel newInstance(
      AppStartingStateDataRepository appStartingStateDataRepository) {
    return new MessagingActivityViewModel(appStartingStateDataRepository);
  }
}

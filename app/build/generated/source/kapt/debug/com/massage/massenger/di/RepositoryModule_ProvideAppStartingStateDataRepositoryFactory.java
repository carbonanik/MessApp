package com.massage.massenger.di;

import com.massage.massenger.data.local.pref.AppStartingStateDataSource;
import com.massage.massenger.data.repository.AppStartingStateDataRepository;
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
public final class RepositoryModule_ProvideAppStartingStateDataRepositoryFactory implements Factory<AppStartingStateDataRepository> {
  private final Provider<AppStartingStateDataSource> dataSourceProvider;

  public RepositoryModule_ProvideAppStartingStateDataRepositoryFactory(
      Provider<AppStartingStateDataSource> dataSourceProvider) {
    this.dataSourceProvider = dataSourceProvider;
  }

  @Override
  public AppStartingStateDataRepository get() {
    return provideAppStartingStateDataRepository(dataSourceProvider.get());
  }

  public static RepositoryModule_ProvideAppStartingStateDataRepositoryFactory create(
      Provider<AppStartingStateDataSource> dataSourceProvider) {
    return new RepositoryModule_ProvideAppStartingStateDataRepositoryFactory(dataSourceProvider);
  }

  public static AppStartingStateDataRepository provideAppStartingStateDataRepository(
      AppStartingStateDataSource dataSource) {
    return Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideAppStartingStateDataRepository(dataSource));
  }
}

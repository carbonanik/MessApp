package com.massage.massenger.di;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import com.massage.massenger.data.local.pref.AppStartingStateDataSource;
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
public final class DataStoreModule_ProvideAppStateDataSourceFactory implements Factory<AppStartingStateDataSource> {
  private final Provider<DataStore<Preferences>> dataStoreProvider;

  public DataStoreModule_ProvideAppStateDataSourceFactory(
      Provider<DataStore<Preferences>> dataStoreProvider) {
    this.dataStoreProvider = dataStoreProvider;
  }

  @Override
  public AppStartingStateDataSource get() {
    return provideAppStateDataSource(dataStoreProvider.get());
  }

  public static DataStoreModule_ProvideAppStateDataSourceFactory create(
      Provider<DataStore<Preferences>> dataStoreProvider) {
    return new DataStoreModule_ProvideAppStateDataSourceFactory(dataStoreProvider);
  }

  public static AppStartingStateDataSource provideAppStateDataSource(
      DataStore<Preferences> dataStore) {
    return Preconditions.checkNotNullFromProvides(DataStoreModule.INSTANCE.provideAppStateDataSource(dataStore));
  }
}

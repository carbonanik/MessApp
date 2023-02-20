package com.massage.massenger.data.remote.socket;

import com.massage.massenger.data.local.pref.UserDataSource;
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
public final class CustomSocket_Factory implements Factory<CustomSocket> {
  private final Provider<UserDataSource> userDataSourceProvider;

  public CustomSocket_Factory(Provider<UserDataSource> userDataSourceProvider) {
    this.userDataSourceProvider = userDataSourceProvider;
  }

  @Override
  public CustomSocket get() {
    return newInstance(userDataSourceProvider.get());
  }

  public static CustomSocket_Factory create(Provider<UserDataSource> userDataSourceProvider) {
    return new CustomSocket_Factory(userDataSourceProvider);
  }

  public static CustomSocket newInstance(UserDataSource userDataSource) {
    return new CustomSocket(userDataSource);
  }
}

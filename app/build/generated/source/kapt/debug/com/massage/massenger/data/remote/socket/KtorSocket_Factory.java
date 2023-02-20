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
public final class KtorSocket_Factory implements Factory<KtorSocket> {
  private final Provider<UserDataSource> userDataSourceProvider;

  public KtorSocket_Factory(Provider<UserDataSource> userDataSourceProvider) {
    this.userDataSourceProvider = userDataSourceProvider;
  }

  @Override
  public KtorSocket get() {
    return newInstance(userDataSourceProvider.get());
  }

  public static KtorSocket_Factory create(Provider<UserDataSource> userDataSourceProvider) {
    return new KtorSocket_Factory(userDataSourceProvider);
  }

  public static KtorSocket newInstance(UserDataSource userDataSource) {
    return new KtorSocket(userDataSource);
  }
}

package com.massage.massenger.di;

import com.massage.massenger.data.remote.api_service.user.UserApiService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import io.ktor.client.HttpClient;
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
public final class NetworkModule_ProvideUserApiServiceFactory implements Factory<UserApiService> {
  private final Provider<HttpClient> clientProvider;

  public NetworkModule_ProvideUserApiServiceFactory(Provider<HttpClient> clientProvider) {
    this.clientProvider = clientProvider;
  }

  @Override
  public UserApiService get() {
    return provideUserApiService(clientProvider.get());
  }

  public static NetworkModule_ProvideUserApiServiceFactory create(
      Provider<HttpClient> clientProvider) {
    return new NetworkModule_ProvideUserApiServiceFactory(clientProvider);
  }

  public static UserApiService provideUserApiService(HttpClient client) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideUserApiService(client));
  }
}

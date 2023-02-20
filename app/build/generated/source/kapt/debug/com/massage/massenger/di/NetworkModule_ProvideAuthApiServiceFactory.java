package com.massage.massenger.di;

import com.massage.massenger.data.remote.api_service.auth.AuthApiService;
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
public final class NetworkModule_ProvideAuthApiServiceFactory implements Factory<AuthApiService> {
  private final Provider<HttpClient> clientProvider;

  public NetworkModule_ProvideAuthApiServiceFactory(Provider<HttpClient> clientProvider) {
    this.clientProvider = clientProvider;
  }

  @Override
  public AuthApiService get() {
    return provideAuthApiService(clientProvider.get());
  }

  public static NetworkModule_ProvideAuthApiServiceFactory create(
      Provider<HttpClient> clientProvider) {
    return new NetworkModule_ProvideAuthApiServiceFactory(clientProvider);
  }

  public static AuthApiService provideAuthApiService(HttpClient client) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideAuthApiService(client));
  }
}

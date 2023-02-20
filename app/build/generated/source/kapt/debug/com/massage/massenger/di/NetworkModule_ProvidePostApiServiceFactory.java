package com.massage.massenger.di;

import com.massage.massenger.data.remote.api_service.post.PostApiService;
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
public final class NetworkModule_ProvidePostApiServiceFactory implements Factory<PostApiService> {
  private final Provider<HttpClient> clientProvider;

  public NetworkModule_ProvidePostApiServiceFactory(Provider<HttpClient> clientProvider) {
    this.clientProvider = clientProvider;
  }

  @Override
  public PostApiService get() {
    return providePostApiService(clientProvider.get());
  }

  public static NetworkModule_ProvidePostApiServiceFactory create(
      Provider<HttpClient> clientProvider) {
    return new NetworkModule_ProvidePostApiServiceFactory(clientProvider);
  }

  public static PostApiService providePostApiService(HttpClient client) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.providePostApiService(client));
  }
}

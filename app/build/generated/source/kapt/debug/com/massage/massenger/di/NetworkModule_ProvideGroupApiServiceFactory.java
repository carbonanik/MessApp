package com.massage.massenger.di;

import com.massage.massenger.data.remote.api_service.group.GroupApiService;
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
public final class NetworkModule_ProvideGroupApiServiceFactory implements Factory<GroupApiService> {
  private final Provider<HttpClient> clientProvider;

  public NetworkModule_ProvideGroupApiServiceFactory(Provider<HttpClient> clientProvider) {
    this.clientProvider = clientProvider;
  }

  @Override
  public GroupApiService get() {
    return provideGroupApiService(clientProvider.get());
  }

  public static NetworkModule_ProvideGroupApiServiceFactory create(
      Provider<HttpClient> clientProvider) {
    return new NetworkModule_ProvideGroupApiServiceFactory(clientProvider);
  }

  public static GroupApiService provideGroupApiService(HttpClient client) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideGroupApiService(client));
  }
}

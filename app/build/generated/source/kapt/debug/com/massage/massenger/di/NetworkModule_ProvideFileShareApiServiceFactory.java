package com.massage.massenger.di;

import com.massage.massenger.data.remote.api_service.file.FileShareApiService;
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
public final class NetworkModule_ProvideFileShareApiServiceFactory implements Factory<FileShareApiService> {
  private final Provider<HttpClient> clientProvider;

  public NetworkModule_ProvideFileShareApiServiceFactory(Provider<HttpClient> clientProvider) {
    this.clientProvider = clientProvider;
  }

  @Override
  public FileShareApiService get() {
    return provideFileShareApiService(clientProvider.get());
  }

  public static NetworkModule_ProvideFileShareApiServiceFactory create(
      Provider<HttpClient> clientProvider) {
    return new NetworkModule_ProvideFileShareApiServiceFactory(clientProvider);
  }

  public static FileShareApiService provideFileShareApiService(HttpClient client) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideFileShareApiService(client));
  }
}

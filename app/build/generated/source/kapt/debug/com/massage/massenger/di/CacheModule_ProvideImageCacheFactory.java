package com.massage.massenger.di;

import android.content.Context;
import com.massage.massenger.data.local.cache.ImageCache;
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
public final class CacheModule_ProvideImageCacheFactory implements Factory<ImageCache> {
  private final Provider<Context> contextProvider;

  public CacheModule_ProvideImageCacheFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public ImageCache get() {
    return provideImageCache(contextProvider.get());
  }

  public static CacheModule_ProvideImageCacheFactory create(Provider<Context> contextProvider) {
    return new CacheModule_ProvideImageCacheFactory(contextProvider);
  }

  public static ImageCache provideImageCache(Context context) {
    return Preconditions.checkNotNullFromProvides(CacheModule.INSTANCE.provideImageCache(context));
  }
}

package com.massage.massenger.data.local.content;

import android.content.Context;
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
public final class ExternalStorageImageProvider_Factory implements Factory<ExternalStorageImageProvider> {
  private final Provider<Context> contextProvider;

  public ExternalStorageImageProvider_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public ExternalStorageImageProvider get() {
    return newInstance(contextProvider.get());
  }

  public static ExternalStorageImageProvider_Factory create(Provider<Context> contextProvider) {
    return new ExternalStorageImageProvider_Factory(contextProvider);
  }

  public static ExternalStorageImageProvider newInstance(Context context) {
    return new ExternalStorageImageProvider(context);
  }
}

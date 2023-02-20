package com.massage.massenger.data.local.assets;

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
public final class CountryCodeRepository_Factory implements Factory<CountryCodeRepository> {
  private final Provider<Context> contextProvider;

  public CountryCodeRepository_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public CountryCodeRepository get() {
    return newInstance(contextProvider.get());
  }

  public static CountryCodeRepository_Factory create(Provider<Context> contextProvider) {
    return new CountryCodeRepository_Factory(contextProvider);
  }

  public static CountryCodeRepository newInstance(Context context) {
    return new CountryCodeRepository(context);
  }
}

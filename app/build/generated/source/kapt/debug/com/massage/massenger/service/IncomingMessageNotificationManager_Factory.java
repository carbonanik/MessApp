package com.massage.massenger.service;

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
public final class IncomingMessageNotificationManager_Factory implements Factory<IncomingMessageNotificationManager> {
  private final Provider<Context> contextProvider;

  public IncomingMessageNotificationManager_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public IncomingMessageNotificationManager get() {
    return newInstance(contextProvider.get());
  }

  public static IncomingMessageNotificationManager_Factory create(
      Provider<Context> contextProvider) {
    return new IncomingMessageNotificationManager_Factory(contextProvider);
  }

  public static IncomingMessageNotificationManager newInstance(Context context) {
    return new IncomingMessageNotificationManager(context);
  }
}

package com.massage.massenger.presentation.messaging.video_play;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class VideosViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static VideosViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(VideosViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final VideosViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new VideosViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}

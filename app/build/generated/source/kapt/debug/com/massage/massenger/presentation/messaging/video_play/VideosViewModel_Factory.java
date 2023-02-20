package com.massage.massenger.presentation.messaging.video_play;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class VideosViewModel_Factory implements Factory<VideosViewModel> {
  @Override
  public VideosViewModel get() {
    return newInstance();
  }

  public static VideosViewModel_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static VideosViewModel newInstance() {
    return new VideosViewModel();
  }

  private static final class InstanceHolder {
    private static final VideosViewModel_Factory INSTANCE = new VideosViewModel_Factory();
  }
}

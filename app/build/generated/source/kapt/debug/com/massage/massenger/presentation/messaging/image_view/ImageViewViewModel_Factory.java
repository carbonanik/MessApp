package com.massage.massenger.presentation.messaging.image_view;

import com.massage.massenger.data.local.content.ExternalStorageImageProvider;
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
public final class ImageViewViewModel_Factory implements Factory<ImageViewViewModel> {
  private final Provider<ExternalStorageImageProvider> externalStorageImageProvider;

  public ImageViewViewModel_Factory(
      Provider<ExternalStorageImageProvider> externalStorageImageProvider) {
    this.externalStorageImageProvider = externalStorageImageProvider;
  }

  @Override
  public ImageViewViewModel get() {
    return newInstance(externalStorageImageProvider.get());
  }

  public static ImageViewViewModel_Factory create(
      Provider<ExternalStorageImageProvider> externalStorageImageProvider) {
    return new ImageViewViewModel_Factory(externalStorageImageProvider);
  }

  public static ImageViewViewModel newInstance(
      ExternalStorageImageProvider externalStorageImageProvider) {
    return new ImageViewViewModel(externalStorageImageProvider);
  }
}

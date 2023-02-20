package com.massage.massenger.presentation.messaging.image_gallery;

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
public final class ImageGridViewModel_Factory implements Factory<ImageGridViewModel> {
  private final Provider<ExternalStorageImageProvider> externalStorageImageProvider;

  public ImageGridViewModel_Factory(
      Provider<ExternalStorageImageProvider> externalStorageImageProvider) {
    this.externalStorageImageProvider = externalStorageImageProvider;
  }

  @Override
  public ImageGridViewModel get() {
    return newInstance(externalStorageImageProvider.get());
  }

  public static ImageGridViewModel_Factory create(
      Provider<ExternalStorageImageProvider> externalStorageImageProvider) {
    return new ImageGridViewModel_Factory(externalStorageImageProvider);
  }

  public static ImageGridViewModel newInstance(
      ExternalStorageImageProvider externalStorageImageProvider) {
    return new ImageGridViewModel(externalStorageImageProvider);
  }
}

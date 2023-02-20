package com.massage.massenger.util.image_optimizer;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J(\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH\u0002J@\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000fH\u0002J$\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020\u0016H\u0002J\u0018\u0010 \u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0018\u0010!\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\nH\u0002J\u0018\u0010#\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\nH\u0002J*\u0010$\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u0004H\u0002JP\u0010&\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016J0\u0010\'\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u000fH\u0002J\u0018\u0010(\u001a\u00020)2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0002J(\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0002\u00a8\u0006*"}, d2 = {"Lcom/massage/massenger/util/image_optimizer/ImageOptimizer;", "", "()V", "calculateImageMatrix", "Landroid/graphics/Matrix;", "context", "Landroid/content/Context;", "imageUri", "Landroid/net/Uri;", "scaleFactor", "", "bmOptions", "Landroid/graphics/BitmapFactory$Options;", "calculateScaleDownFactor", "useMaxScale", "", "maxWidth", "maxHeight", "calculateScaleUpFactor", "photoW", "photoH", "minWidth", "", "minHeight", "shouldScaleUp", "compressAndSaveImage", "", "bitmap", "Landroid/graphics/Bitmap;", "compressFormat", "Landroid/graphics/Bitmap$CompressFormat;", "quality", "decodeBitmapFromUri", "finalHeight", "scaleUpFactor", "finalWidth", "generateNewBitmap", "matrix", "optimize", "scaleUpBitmapIfNeeded", "setNearestInSampleSize", "", "app_debug"})
public final class ImageOptimizer {
    @org.jetbrains.annotations.NotNull()
    public static final com.massage.massenger.util.image_optimizer.ImageOptimizer INSTANCE = null;
    
    private ImageOptimizer() {
        super();
    }
    
    /**
     * @param context the application environment
     * @param imageUri the input image uri. usually "content://..."
     * @param compressFormat the output image file format
     * @param maxWidth the output image max width
     * @param maxHeight the output image max height
     * @param useMaxScale determine whether to use the bigger dimension
     * between [maxWidth] or [maxHeight]
     * @param quality the output image compress quality
     * @param minWidth the output image min width
     * @param minHeight the output image min height
     *
     * @return output image [android.net.Uri]
     */
    @org.jetbrains.annotations.Nullable()
    public final android.net.Uri optimize(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.net.Uri imageUri, @org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap.CompressFormat compressFormat, float maxWidth, float maxHeight, boolean useMaxScale, int quality, int minWidth, int minHeight) {
        return null;
    }
    
    private final android.graphics.BitmapFactory.Options decodeBitmapFromUri(android.content.Context context, android.net.Uri imageUri) {
        return null;
    }
    
    private final float calculateScaleDownFactor(android.graphics.BitmapFactory.Options bmOptions, boolean useMaxScale, float maxWidth, float maxHeight) {
        return 0.0F;
    }
    
    private final void setNearestInSampleSize(android.graphics.BitmapFactory.Options bmOptions, float scaleFactor) {
    }
    
    private final android.graphics.Matrix calculateImageMatrix(android.content.Context context, android.net.Uri imageUri, float scaleFactor, android.graphics.BitmapFactory.Options bmOptions) {
        return null;
    }
    
    private final android.graphics.Bitmap generateNewBitmap(android.content.Context context, android.net.Uri imageUri, android.graphics.BitmapFactory.Options bmOptions, android.graphics.Matrix matrix) {
        return null;
    }
    
    private final boolean shouldScaleUp(int photoW, int photoH, int minWidth, int minHeight) {
        return false;
    }
    
    private final float calculateScaleUpFactor(float photoW, float photoH, float maxWidth, float maxHeight, int minWidth, int minHeight, boolean shouldScaleUp) {
        return 0.0F;
    }
    
    private final int finalWidth(float photoW, float scaleUpFactor) {
        return 0;
    }
    
    private final int finalHeight(float photoH, float scaleUpFactor) {
        return 0;
    }
    
    private final android.graphics.Bitmap scaleUpBitmapIfNeeded(android.graphics.Bitmap bitmap, int finalWidth, int finalHeight, float scaleUpFactor, boolean shouldScaleUp) {
        return null;
    }
    
    private final java.lang.String compressAndSaveImage(android.graphics.Bitmap bitmap, android.graphics.Bitmap.CompressFormat compressFormat, int quality) {
        return null;
    }
}
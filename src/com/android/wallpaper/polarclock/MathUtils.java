package com.android.wallpaper.polarclock;

/**
 * from https://github.com/android/platform_frameworks_base/blob/master/core/java/android/util/MathUtils.java
 */
public class MathUtils {
    public static float lerp(float start, float stop, float amount) {
        return start + (stop - start) * amount;
    }
}

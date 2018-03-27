package com.tmron.androidlib;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public class AndroidLibClass {

    public static @Nullable String toNullable(@NonNull String input) {
        if (input.length() < 2) {
            return null;
        } else {
            return input;
        }
    }
}

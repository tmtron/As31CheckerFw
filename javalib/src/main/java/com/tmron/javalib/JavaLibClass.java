package com.tmron.javalib;

import javax.annotation.Nullable;

public class JavaLibClass {

    public static @Nullable String toNullable(String input) {
        if (input.length() < 2) {
            return null;
        } else {
            return input;
        }
    }
}

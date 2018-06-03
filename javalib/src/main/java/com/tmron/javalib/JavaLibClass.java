package com.tmron.javalib;

import javax.annotation.Nullable;

public class JavaLibClass {

    private static @Nullable Integer getLengthThresholdNullable() {
        return null;
    }

    private static  Integer getLengthThreshold() {
        return 2;
    }

    public static @Nullable String toNullable(String input) {
        /* when the nullable version is activated, the nullness-checker will report:
         *  error: [unboxing.of.nullable] unboxing a possibly-null reference getLengthThresholdNullable()
         */
        //if (input.length() < getLengthThresholdNullable()) {
        if (input.length() < getLengthThreshold()) {
            return null;
        } else {
            return input;
        }
    }
}

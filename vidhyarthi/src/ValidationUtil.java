package com.vityarthi.utils;

public class ValidationUtil {
    public static boolean isValidUsername(String username) {
        return username.length() >= 3;
    }
}

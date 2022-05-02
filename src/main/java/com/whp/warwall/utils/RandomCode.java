package com.whp.warwall.utils;

import java.util.Random;

public class RandomCode {
    public static Random random = new Random();

    public static String getWallUUID() {
        String code = "";
        for (int i = 0; i < 10; i++) {
            code = code + String.valueOf(random.nextInt(10));
        }
        return code;
    }
}

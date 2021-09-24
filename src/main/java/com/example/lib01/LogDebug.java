package com.example.lib01;

import android.util.Log;

public class LogDebug {
    private static final String TAG = "SUPER_LIB";

    public static void d(String msg) {
        Log.d(TAG, msg);
    }
}

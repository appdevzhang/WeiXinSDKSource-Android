package com.tencent.mm.opensdk.utils;

import android.os.Bundle;

public final class a {
    public static int a(Bundle bundle, String str) {
        int i = -1;
        if (bundle != null) {
            try {
                i = bundle.getInt(str, -1);
            } catch (Exception e) {
                Log.e("MicroMsg.IntentUtil", "getIntExtra exception:" + e.getMessage());
            }
        }
        return i;
    }

    public static String b(Bundle bundle, String str) {
        String str2 = null;
        if (bundle != null) {
            try {
                str2 = bundle.getString(str);
            } catch (Exception e) {
                Log.e("MicroMsg.IntentUtil", "getStringExtra exception:" + e.getMessage());
            }
        }
        return str2;
    }
}

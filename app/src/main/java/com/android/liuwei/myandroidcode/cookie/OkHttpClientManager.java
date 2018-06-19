package com.android.liuwei.myandroidcode.cookie;

import android.content.Context;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;

/**
 * User: liuwei(wei.liu@neulion.com.com)
 * Date: 2018-06-11
 * Time: 15:55
 */
public class OkHttpClientManager
{
    private static OkHttpClient sOkHttpClient;

    public static void init(Context context)
    {
        sOkHttpClient = new OkHttpClient.Builder()
                .connectTimeout(5000, TimeUnit.MILLISECONDS)
                .cookieJar(new CookieJarManager(context))
                .build();
    }

    public static OkHttpClient getOkHttpClient()
    {
        return sOkHttpClient;
    }
}

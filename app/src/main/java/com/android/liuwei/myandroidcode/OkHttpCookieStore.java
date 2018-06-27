package com.android.liuwei.myandroidcode;

import java.net.URI;
import java.util.List;
import java.util.Set;

import okhttp3.Cookie;

/**
 * User: liuwei(wei.liu@neulion.com.com)
 * Date: 2018-06-27
 * Time: 11:32
 */
public interface OkHttpCookieStore
{
    void addCookie(URI uri, Cookie cookie);

    void removeCookie(URI uri, Cookie cookie);

    void removeAllCookie();

    List<Cookie> getCookie(URI uri);

    List<Cookie> getCookie(String host);

    List<Cookie> getAllCookie();

    Set<String> getCookieDomainUrl();
}

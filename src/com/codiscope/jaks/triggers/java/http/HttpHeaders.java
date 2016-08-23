package com.codiscope.jaks.triggers.java.http;

import tests.sources.PrivateSource;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

public class HttpHeaders {
    private PrivateSource privateSource = new PrivateSource();

    public void headers(){
        String source = privateSource.method1();
        HttpServletResponse response = null;
        response.addHeader(source.replaceAll("\\p{C}", ""), source.replaceAll("\\p{C}", ""));
        response.setHeader(source.replaceAll("\\p{C}", ""), source.replaceAll("\\p{C}", ""));
    }

    public void cookie(){
        String source = privateSource.method1();
        Cookie cookie = new Cookie(source, source);
        cookie.setPath(source);
        cookie.setSecure(true);
        HttpServletResponse response = null;
        response.addCookie(cookie);
    }
}

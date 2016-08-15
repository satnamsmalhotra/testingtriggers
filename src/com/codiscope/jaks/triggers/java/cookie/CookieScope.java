package com.codiscope.jaks.triggers.java.cookie;

import javax.servlet.http.Cookie;

public class CookieScope {

	public void cookies(){
		
		String sessionID= "";
		Cookie cookie = new Cookie("jsessionID", sessionID);
		cookie.setPath("/");
	}
}

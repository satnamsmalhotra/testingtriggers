package com.codiscope.jaks.triggers.java.cookie;

import javax.servlet.http.Cookie;

public class CookieScope {

	public void positiveTest(){

		String sessionID= "";
		Cookie cookie = new Cookie("jsessionID", sessionID);
		cookie.setPath("/");
	}
	public void negativeTest(){
		
		String sessionID= "";
		Cookie cookie = new Cookie("jsessionID", sessionID);
		cookie.setSecure(true);
		cookie.setPath("/");
	}


}

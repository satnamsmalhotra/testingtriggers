package com.codiscope.jaks.triggers.java.files;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookiewithoutSecureflagset {
		
	public void sendResponseWithFlag(HttpServletRequest request, HttpServletResponse response){
		String sessionid = request.getSession().getId();
		response.setHeader("SET-COOKIE", "JSESSIONID=" + sessionid + "; Secure");
	}
	
	public void sendResponseWithoutFlag(HttpServletRequest request, HttpServletResponse response){
		String sessionid = request.getSession().getId();
		response.setHeader("SET-COOKIE", "JSESSIONID=" + sessionid + "; HttpOnly");
	}
	

}

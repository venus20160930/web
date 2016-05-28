package com.venus.frontend.component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.WebAttributes;
import org.springframework.security.web.savedrequest.RequestCache;
import org.springframework.security.web.savedrequest.SavedRequest;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.web.SignInAdapter;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.NativeWebRequest;

import com.venus.frontend.util.LoginUtil;

@Component
public class LoginAdapter implements SignInAdapter {

	@Autowired
	private RequestCache requestCache;
	
	public String signIn(String userId, Connection<?> connection, NativeWebRequest request) {
		
		LoginUtil.login(userId);
		
		return extractOriginalUrl(request);
	}
	
	private String extractOriginalUrl(NativeWebRequest request) {
		
		HttpServletRequest httpRequest = request.getNativeRequest(HttpServletRequest.class);
		HttpServletResponse httpResponse = request.getNativeResponse(HttpServletResponse.class);
		
		SavedRequest saved = requestCache.getRequest(httpRequest, httpResponse);
		if (saved != null) {
			
			requestCache.removeRequest(httpRequest, httpResponse);
			removeAutheticationAttributes(httpRequest.getSession(false));
		}
		
		return saved.getRedirectUrl();
	}
		 
	
	private void removeAutheticationAttributes(HttpSession session) {
		
		if (session != null) {
			
			session.removeAttribute(WebAttributes.AUTHENTICATION_EXCEPTION);
		}
	}

}

package ifi.p20.gl.utils;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

public class HandlerSession {
	public static UserDetails currentUserDetails(){
	    SecurityContext securityContext = SecurityContextHolder.getContext();
	    Authentication authentication = securityContext.getAuthentication();
	    if (authentication != null) {
	        Object principal = authentication.getPrincipal();
	        return principal instanceof UserDetails ? (UserDetails) principal : null;
	    }
	    return null;
	}
	public static String currentKeyWord(HttpServletRequest request){
		return (String) request.getSession().getAttribute("keyWord");
	}
	
	public static void setCurrentKeyWord(HttpServletRequest request, String keyWord){
		System.out.println("set key word in session "+keyWord);
		request.getSession().setAttribute("keyWord", keyWord);
	}
	
	public static void removeCurrentKeyWord(HttpServletRequest request){
		request.getSession().setAttribute("keyWord", null);
	}
}

package it.gniado.bets.utils;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class SessionUtils {

    private static ExternalContext getFacesExternalContext() {
        return FacesContext.getCurrentInstance().getExternalContext();
    }

    public static HttpSession getSession() {
        return (HttpSession) getFacesExternalContext().getSession(false);
    }

    public static HttpServletRequest getRequest() {
        return (HttpServletRequest) getFacesExternalContext().getRequest();
    }

    public static String getUsername() {
        return getSession().getAttribute("username").toString();
    }

}

package it.gniado.bets.controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import it.gniado.bets.service.LoginService;
import it.gniado.bets.utils.SessionUtils;

@ManagedBean(name = "loginController")
@SessionScoped
public class LoginController {

    private String username;
    private String password;

    private final LoginService loginService;

    @Inject
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    public String authenticate() {
        if (loginService.authenticate(username, password)) {
            SessionUtils.getSession().setAttribute("username", username);
            return "home";
        } else {
            return "login";
        }
    }

    public String logout() {
        SessionUtils.getSession().invalidate();
        return "login";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

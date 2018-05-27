package it.gniado.bets.service;

import javax.ejb.EJB;
import javax.enterprise.context.Dependent;

import it.gniado.bets.dao.UserDao;

@Dependent
public class LoginService {

    @EJB
    private UserDao userDao;

    public boolean authenticate(String user, String password) {
        return userDao.findUserByAuthData(user, password) != null;
    }

}

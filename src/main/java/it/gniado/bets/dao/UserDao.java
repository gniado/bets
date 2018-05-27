package it.gniado.bets.dao;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.Query;

import it.gniado.bets.dbo.User;

@Stateless
@LocalBean
public class UserDao extends AbstractDao<User> {

    public User findUserByAuthData(String user, String password) {
        Query query = em.createQuery("SELECT new it.gniado.bets.dbo.User(id, name, password, points) FROM User u WHERE u.name " + "= " + ":name AND u" + ".password = " + ":password");
        query.setParameter("name", user);
        query.setParameter("password", password);
        return (User) query.getSingleResult();
    }

}

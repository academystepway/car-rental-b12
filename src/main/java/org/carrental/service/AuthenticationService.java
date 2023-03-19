package org.carrental.service;

import org.carrental.dao.UserDao;
import org.carrental.domain.User;

public class AuthenticationService {

    private final UserDao userDao = new UserDao();
    public Boolean checkLogin(String username,String password){
      User user =  userDao.getUserByUsernameAndPassword(username,password);
        if(user !=null){
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}

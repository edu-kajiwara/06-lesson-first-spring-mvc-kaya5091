package tama.ac.jp.service;

import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tama.ac.jp.dao.UserDAO;
import tama.ac.jp.model.User;

/**
 * Created by YK on 2017/05/30.
 */

@Service
public class UserService {
    @Autowired
    private UserDAO userDAO;

    @Transactional
    public void multiUserRegister(){
        val user1 = new User("20611082","小澤遊矢");
        userDAO.insertUser(user1);
        val badRequestUser = new User("21511091","茅島佑樹");
        userDAO.insertUser(badRequestUser);
    }
}

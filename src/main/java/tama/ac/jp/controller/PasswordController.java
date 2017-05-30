package tama.ac.jp.controller;

import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tama.ac.jp.dao.PasswordDAO;
import tama.ac.jp.model.Password;
import tama.ac.jp.model.User;

import java.util.List;

/**
 * Created by YK on 2017/05/30.
 */

@RestController
@RequestMapping(value = "password")
public class PasswordController {
    @Autowired
    PasswordDAO passwordDAO;

    @RequestMapping(method = RequestMethod.GET)
    public List<Password> showUserList(){
        val result = passwordDAO.selectPasswordList();
        return result;
    }
}

package com.eric.usermanagement.usermanagement.web.controller;

import com.eric.usermanagement.usermanagement.api.UserService;
import com.eric.usermanagement.usermanagement.api.model.UserModel;
import com.eric.usermanagement.usermanagement.dao.dataobject.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@Component
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/username")
    public String getUserName(@RequestParam("id") Long id) {
        return userService.getUserName(id);
    }

    @RequestMapping("/add")
    @ResponseBody
    public UserDO addUser(String name, String passwd) {
        UserModel user = new UserModel();
        user.setName(name);
        user.setPasswd(passwd);
        return userService.addUser(user);
    }
}

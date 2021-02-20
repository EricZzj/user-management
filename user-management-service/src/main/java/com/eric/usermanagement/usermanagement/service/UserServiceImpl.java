package com.eric.usermanagement.usermanagement.service;

import com.eric.usermanagement.usermanagement.api.UserService;
import com.eric.usermanagement.usermanagement.api.model.UserModel;
import com.eric.usermanagement.usermanagement.dao.dataobject.UserDO;
import com.eric.usermanagement.usermanagement.dao.interfaces.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author <a href="mailto:chenxilzx1@gmail.com">theonefx</a>
 */
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserDao userDao;

    public String getUserName(Long id) {
        Optional<UserDO> user = userDao.findById(id);
        if (user.isPresent()) {
            return user.get().getUsername();
        }
        return "null";
    }

    public UserDO addUser(UserModel user) {
        UserDO userDO = new UserDO();
        userDO.setUsername(user.getName());
        userDO.setPasswd(user.getPasswd());
        UserDO save = userDao.save(userDO);
        return save;
    }

}

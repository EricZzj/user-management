package com.eric.usermanagement.usermanagement.api;


import com.eric.usermanagement.usermanagement.api.model.UserModel;
import com.eric.usermanagement.usermanagement.dao.dataobject.UserDO;

/**
 * @author <a href="mailto:chenxilzx1@gmail.com">theonefx</a>
 */
public interface UserService {

    String getUserName(Long id);

    UserDO addUser(UserModel user);
}

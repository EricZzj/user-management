package com.eric.usermanagement.usermanagement.dao.interfaces;

import com.eric.usermanagement.usermanagement.dao.dataobject.UserDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<UserDO, Long> {

}

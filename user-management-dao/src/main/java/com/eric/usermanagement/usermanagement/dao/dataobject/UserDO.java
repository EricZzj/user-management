package com.eric.usermanagement.usermanagement.dao.dataobject;

import lombok.Data;

import javax.persistence.*;

/**
 * @author <a href="mailto:chenxilzx1@gmail.com">theonefx</a>
 */
@Data
@Entity
@Table(name = "tb_test")
public class UserDO {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "username",length = 128)
    private String username;

    @Column(name = "passwd",length = 32)
    private String passwd;
}

package com.eric.usermanagement.usermanagement.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(
        scanBasePackages = {
                "com.eric.usermanagement.usermanagement.*",
        })
//@ComponentScan("com.eric.usermanagement.usermanagement.dao.*")
//@ComponentScan("***.***") // 1. 多模块项目需要扫描的包
@EnableJpaRepositories("com.eric.usermanagement.usermanagement.dao.interfaces") // 2. Dao 层所在的包
@EntityScan("com.eric.usermanagement.usermanagement.dao.dataobject") // 3. Entity 所在的包
public class UserManagementApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserManagementApplication.class, args);
    }
}

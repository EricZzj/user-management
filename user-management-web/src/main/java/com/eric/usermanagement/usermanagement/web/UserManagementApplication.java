package com.eric.usermanagement.usermanagement.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.eric.usermanagement.usermanagement.*"})
@EnableJpaRepositories("com.eric.usermanagement.usermanagement.dao.interfaces")
@EntityScan("com.eric.usermanagement.usermanagement.dao.dataobject")
public class UserManagementApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserManagementApplication.class, args);
    }
}

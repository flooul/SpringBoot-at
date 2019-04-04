package com.at.atadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories(basePackages={"com.at.respository"})
//@EnableJpaRepositories(basePackages={"dao层对应的包路径"})
@ComponentScan(basePackages = {"com.at.atadmin.controller","com.at.impl"})
@SpringBootApplication
//@EntityScan("entity对应的包路径")
@EntityScan("com.at.pojo")
public class AtAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(AtAdminApplication.class, args);
    }

}

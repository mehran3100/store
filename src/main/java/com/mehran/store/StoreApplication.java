package com.mehran.store;

import com.mehran.store.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
//        SpringApplication.run(StoreApplication.class, args);
        var user = User.builder()
                .id(1)
                .name("mamad")
                .email("123")
                .password("321")
                .build();
        System.out.println(user);
    }

}

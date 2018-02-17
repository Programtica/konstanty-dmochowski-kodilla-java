package com.kodilla.spring.forum;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component
public class ForumUser {
    private final String userName;

    public ForumUser() {
        userName = "John Smith";
    }

    public String getUserName() {
        return this.userName;
    }
}

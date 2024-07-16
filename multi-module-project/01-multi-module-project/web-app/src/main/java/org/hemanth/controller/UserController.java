package org.hemanth.controller;

import com.hemanth.entities.User;
import guru.springframework.domain.UserCommand;

public class UserController {

    User saveUser(UserCommand command){
        return new User();
    }
}

package com.myproject.pick_market.user;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserService userService;


    //Test
    @RequestMapping(value = "/test")
    public String testing() {
        return "Test Function is Working";
    }


    //Add new user
    @RequestMapping(value = "/newUser")
    public User save(@RequestBody User user) {
        User userSave = userService.save(user);
        log.info("User Added, USER_ID : {} ", userSave.getRecordId());

        return userSave;
    }


    //Get all items
    @RequestMapping(value = "/getAll")
    public List<User> getUser() {
        return userService.getAllUser();
    }
}

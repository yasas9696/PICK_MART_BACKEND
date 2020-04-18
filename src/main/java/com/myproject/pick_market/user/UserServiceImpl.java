package com.myproject.pick_market.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    Userrepository userrepository;

    //Add new member
    @Override
    public User save(User user) {
        return userrepository.save(user);
    }


    public List<User> getAllUser() {
        return userrepository.findAll();
    }
}

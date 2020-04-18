package com.myproject.pick_market.user;

import java.util.List;

public interface UserService {
    User save(User user);

    List<User> getAllUser();
}

package com.myproject.pick_market.cart;

import com.myproject.pick_market.user.User;

import java.util.List;


public interface CartService {
    Cart save(Cart cart);

    List<Cart> getAllCart();
}

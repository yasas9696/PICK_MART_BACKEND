package com.myproject.pick_market.cart;

import com.myproject.pick_market.user.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CartRepository extends JpaRepository<Cart, Integer> {
}

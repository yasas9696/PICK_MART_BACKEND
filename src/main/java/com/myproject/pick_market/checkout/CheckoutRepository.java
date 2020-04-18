package com.myproject.pick_market.checkout;

import com.myproject.pick_market.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckoutRepository extends JpaRepository<Checkout, Integer> {
}

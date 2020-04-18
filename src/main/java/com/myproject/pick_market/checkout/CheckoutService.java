package com.myproject.pick_market.checkout;

import com.myproject.pick_market.user.User;

import java.util.List;


public interface CheckoutService {
    Checkout save(Checkout checkout);

    List<Checkout> getAllCheckout();
}

package com.myproject.pick_market.checkout;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CheckoutServiceImpl implements CheckoutService {

    @Autowired
    CheckoutRepository checkoutRepository;

    //Add new member
    @Override
    public Checkout save(Checkout checkout) {
        return checkoutRepository.save(checkout);
    }


    public List<Checkout> getAllCheckout() {
        return checkoutRepository.findAll();
    }
}

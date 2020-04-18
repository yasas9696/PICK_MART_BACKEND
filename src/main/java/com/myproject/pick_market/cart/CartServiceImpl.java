package com.myproject.pick_market.cart;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CartServiceImpl implements CartService {

    @Autowired
    CartRepository cartRepository;

    //Add new member
    @Override
    public Cart save(Cart cart) {
        return cartRepository.save(cart);
    }


    public List<Cart> getAllCart() {
        return cartRepository.findAll();
    }
}

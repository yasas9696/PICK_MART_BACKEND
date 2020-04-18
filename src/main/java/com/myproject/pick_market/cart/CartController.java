package com.myproject.pick_market.cart;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



@RestController
@Slf4j
@RequestMapping(value = "/cart")
public class CartController {

    @Autowired
    CartService cartService;


    //Test
    @RequestMapping(value = "/test")
    public String testing() {
        return "Test Function is Working";
    }


    //Add new user
    @RequestMapping(value = "/newCart")
    public Cart save(@RequestBody Cart cart) {
        Cart cartSave = cartService.save(cart);
        log.info("User Added, USER_ID : {} ", cartSave.getRecordId());

        return cartSave;
    }


    //Get all items
    @RequestMapping(value = "/getAll")
    public List<Cart> getCart() {
        return cartService.getAllCart();
    }
}
package com.myproject.pick_market.checkout;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;




@RestController
@Slf4j
@RequestMapping(value = "/checkout")
public class CheckoutController {

    @Autowired
    CheckoutService checkoutService;


    //Test
    @RequestMapping(value = "/test")
    public String testing() {
        return "Test Function is Working";
    }


    //Add new user
    @RequestMapping(value = "/addCheckout")
    public Checkout save(@RequestBody Checkout checkout) {
        Checkout checkoutSave = checkoutService.save(checkout);
        log.info("User Added, USER_ID : {} ", checkoutSave.getRecordId());

        return checkoutSave;
    }


    //Get all items
    @RequestMapping(value = "/getAll")
    public List<Checkout> getCheckout() {
        return checkoutService.getAllCheckout();
    }
}

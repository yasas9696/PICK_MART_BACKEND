package com.myproject.pick_market.payment;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping(value = "/payment")
public class PaymentController {
    @Autowired
   PaymentService paymentService;


    //Test
    @RequestMapping(value = "/test")
    public String testing() {
        return "Test Function is Working";
    }


    //Add new user
    @RequestMapping(value = "/newPayment")
    public Payment save(@RequestBody Payment payment) {
        Payment paymentSave = paymentService.save(payment);
        log.info("Payment Added, USER_ID : {} ", paymentSave.getRecordId());

        return paymentSave;
    }


    //Get all items
    @RequestMapping(value = "/getAll")
    public List<Payment> getPayment() {
        return paymentService.getAllPayment();
    }
}





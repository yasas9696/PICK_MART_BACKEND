package com.myproject.pick_market.payment;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    PaymentRepository paymentRepository;

    //Add new member
    @Override
    public Payment save(Payment user) {
        return paymentRepository.save(user);
    }


    public List<Payment> getAllPayment() {
        return paymentRepository.findAll();
    }
}

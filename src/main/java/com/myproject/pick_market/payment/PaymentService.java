package com.myproject.pick_market.payment;


import java.util.List;

public interface PaymentService {
    Payment save(Payment payment);

    List<Payment> getAllPayment();
}
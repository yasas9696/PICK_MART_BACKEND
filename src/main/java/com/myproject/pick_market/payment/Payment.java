package com.myproject.pick_market.payment;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name = "payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RECORD_ID")
    private int recordId;

    @Column(name = "PAYMENT_ID")
    private int paymentIde;

    @Column(name = "USER_ID")
    private int userId;

    @Column(name = "CART_ID")
    private int cartId;

    @Column(name = "PAYMENT_METHOD")
    private String paymentMethod;

    @Column(name = "TOTAL_AMOUNT")
    private String paymentAmount;


}

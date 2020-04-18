package com.myproject.pick_market.shipping;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "shipping")
public class Shipping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SHIPPING_ID")
    private int shippingId;

    @Column(name = "SHIPPING_CUSTOMER")
    private String shippingCustomer;

    @Column(name = "SHIPPING_ADDRESS")
    private String shippingAddress;

    @Column(name = "SHIPPING_PHONE")
    private String shippingPhone;

    @Column(name = "SHIPPING_EMAIL")
    private String shippingEmail;

    @Column(name = "SHIPPING_DATE")
    private String shippingDate;
}







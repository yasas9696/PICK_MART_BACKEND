package com.myproject.pick_market.checkout;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name = "checkout")
public class Checkout {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RECORD_ID")
    private int recordId;

    @Column(name = "ITEM_NAME")
    private String itemName;

    @Column(name = "ITEM_QUENTITY")
    private String itemQuentity;

    @Column(name = "TOTAL_AMOUNT")
    private String totalAmount;

}
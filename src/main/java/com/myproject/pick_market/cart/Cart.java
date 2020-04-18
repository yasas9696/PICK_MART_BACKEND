package com.myproject.pick_market.cart;

import lombok.Data;

import javax.persistence.*;



@Entity
@Data
@Table(name = "cart")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RECORD_ID")
    private int recordId;


    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "ITEM_NAME")
    private String itemName;

    @Column(name = "ITEM_QUENTITY")
    private String itemQuentity;



}
package com.myproject.pick_market.item;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "item")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RECORD_ID")
    private int recordId;

    @Column(name = "ITEM_CODE")
    private String itemCode;

    @Column(name = "ITEM_NAME")
    private String itemName;

    @Column(name = "ITEM_PRICE")
    private String itemPrice;

    @Column(name = "ITEM_DESCRIPTION")
    private String itemDescription;

}
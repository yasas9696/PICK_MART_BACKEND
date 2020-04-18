package com.myproject.pick_market.item;


import java.util.List;

public interface ItemService {

    Item save(Item item);

    Item findByItemCode(String itemCode);

    List<Item> getAllItem();

    List<Item> getAllByItemName(String itemName);
}
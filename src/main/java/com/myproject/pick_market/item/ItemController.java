package com.myproject.pick_market.item;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping(value = "/item")
public class ItemController {

    @Autowired
    ItemService itemService;

    //Test
    @RequestMapping(value = "/test")
    public String testing() {
        return "Test Function is Working";
    }


    //Add new item
    @RequestMapping(value = "/newItem")
    public Item save(@RequestBody Item item) {
        Item itemSave = itemService.save(item);
        log.info("Item Added, RECORD_ID : {} ", itemSave.getRecordId());

        return itemSave;
    }

    //Get item details by item code
    @GetMapping(value = "{itemCode}")
    public Item getItemByItemCode(@PathVariable String itemCode) {
        return itemService.findByItemCode(itemCode);
    }

    //Get all items
    @RequestMapping(value = "/getAll")
    public List<Item> getItem() {
        return itemService.getAllItem();
    }


    //Get  all items by item name
    @RequestMapping(value = "getAll/{itemName}")
    public List<Item> getAllItem(@PathVariable String itemName) {
        return itemService.getAllByItemName(itemName);
    }
}
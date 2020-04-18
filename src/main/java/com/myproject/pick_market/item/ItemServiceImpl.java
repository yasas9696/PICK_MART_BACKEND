package com.myproject.pick_market.item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    ItemRepository itemRepository;

    //Add new member
    @Override
    public Item save(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public Item findByItemCode(String itemCode) {
        Optional<Item> findItem = itemRepository.findByItemCode(itemCode);

        if(findItem.isPresent())
            return findItem.get();
        else
            return new Item();
    }

    public List<Item> getAllItem() {
        return itemRepository.findAll();
    }

    public List<Item> getAllByItemName(String itemName) {
        return itemRepository.findAll();
    }

}
package org.example.delivery.Service;

import org.example.delivery.entity.Item;

import java.util.List;

public interface ItemServices {

    Item createItem(Item item);
    Item getItemById(Long id);

    List<Item> getAllItems();

    void deleteItem(Long id);
}
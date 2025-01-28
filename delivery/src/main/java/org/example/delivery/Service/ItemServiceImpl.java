package org.example.delivery.Service;


import org.example.delivery.Repository.ItemRepository;
import org.example.delivery.entity.Item;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemServices {


    private ItemRepository itemRepository;
    public ItemServiceImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }
    @Override
    public Item createItem(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public Item getItemById(Long id) {
        return null;
    }

    @Override
    public List<Item> getAllItems() {
        return List.of();
    }

    @Override
    public void deleteItem(Long id) {
        itemRepository.deleteById(id);
    }

}
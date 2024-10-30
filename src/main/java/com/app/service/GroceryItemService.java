package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.GroceryItemDao;
import com.app.pojos.GroceryItem;

import jakarta.transaction.Transactional;

import java.util.List;

@Service
@Transactional
public class GroceryItemService {

    @Autowired
    private GroceryItemDao groceryItemDao;

    public List<GroceryItem> getAllItems() {
        return groceryItemDao.getAllGroceryItems();
    }

    public GroceryItem getItemById(Long id) {
        return groceryItemDao.getItemById(id);
    }

    public GroceryItem addItem(GroceryItem item) {
        return groceryItemDao.addSelectedItem(item);
    }

    public GroceryItem updateItem(Long id, GroceryItem itemDetails) {
        GroceryItem item = groceryItemDao.getItemById(id);

        item.setName(itemDetails.getName());
        item.setPrice(itemDetails.getPrice());
        item.setStock(itemDetails.getStock());

        return groceryItemDao.addSelectedItem(item);
    }

    public void deleteItem(Long id) {
    	GroceryItem item = groceryItemDao.getItemById(id);
    	groceryItemDao.deleteItemById(item);
    }

    public void updateInventory(Long id, int quantity) {
        GroceryItem item = groceryItemDao.getItemById(id);
        item.setStock(quantity);
        groceryItemDao.addSelectedItem(item);
    }
}
package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.app.pojos.GroceryItem;
import com.app.service.GroceryItemService;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private GroceryItemService groceryItemService;

    @PostMapping("/item")
    public GroceryItem addItem(@RequestBody GroceryItem item) {
        return groceryItemService.addItem(item);
    }

    @GetMapping("/items")
    public List<GroceryItem> viewAllItems() {
        return groceryItemService.getAllItems();
    }

    @DeleteMapping("/item/{id}")
    public void deleteItem(@PathVariable Long id) {
        groceryItemService.deleteItem(id);
    }

    @PutMapping("/item/{id}")
    public GroceryItem updateItem(@PathVariable Long id, @RequestBody GroceryItem item) {
        return groceryItemService.updateItem(id, item);
    }

    @PatchMapping("/item/{id}/inventory")
    public void updateInventory(@PathVariable Long id, @RequestParam int quantity) {
        groceryItemService.updateInventory(id, quantity);
    }
}

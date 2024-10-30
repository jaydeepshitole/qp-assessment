package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.app.pojos.GroceryItem;
import com.app.service.GroceryItemService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private GroceryItemService groceryItemService;

    @GetMapping("/items")
    public List<GroceryItem> viewAvailableItems() {
        return groceryItemService.getAllItems();
    }

    @PostMapping("/order")
    public List<GroceryItem> createOrder(@RequestBody List<Long> itemIds) {
    	List<GroceryItem> order=new ArrayList<GroceryItem>();
        for(Long id : itemIds) {
        	order.add(groceryItemService.getItemById(id));
        }
        
        // Add logic to send order to registered address of customer
        
        return order;
    }
}
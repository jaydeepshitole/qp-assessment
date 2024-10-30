package com.app.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.GroceryItem;

import jakarta.persistence.EntityManager;

@Repository
public class GroceryItemDao {
	@Autowired
	private EntityManager mgr;

	public List<GroceryItem> getAllGroceryItems() {
		String jpql = "select g from GroceryItem g";
		return mgr.createQuery(jpql, GroceryItem.class).getResultList();
	}

	public GroceryItem getItemById(Long id) {
		return mgr.find(GroceryItem.class, id);
	}

	public GroceryItem addSelectedItem(GroceryItem item) {
		mgr.persist(item);
		return item;
	}

	public void deleteItemById(GroceryItem item) {
		mgr.remove(item);
	}
}

package com.jose.jimi.app.model.dao;

import java.util.Collection;

import com.jose.jimi.app.model.domain.Item;

/**
 * TODO:
 * 
 * @author Jimmy Jose
 * @since April, 2014
 */
public interface ItemDAO {
	
	Item findById(Long itemId);
	Collection<Item> findAll();
	void save(Item item);
	void saveAll(Collection<Item> items);
}
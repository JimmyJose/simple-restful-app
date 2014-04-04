package com.jose.jimi.app.model.dao.jpa;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.jose.jimi.app.model.dao.ItemDAO;
import com.jose.jimi.app.model.domain.Item;

/**
 * TODO:
 * 
 * @author Jimmy Jose
 * @since April, 2014
 */
@Repository
public class ItemJpaDAO implements ItemDAO {

	@PersistenceContext
	protected EntityManager entityManager;
	
	public Item findById(Long itemId) {
		return entityManager.find(Item.class, itemId);
	}

	@SuppressWarnings("unchecked")
	public Collection<Item> findAll() {
		return entityManager.createQuery("SELECT OBJECT(e) FROM Item as e").getResultList();
	}
	
	public void save(Item item) {
		
		if (entityManager.contains(item)) {
			entityManager.merge(item);
		}
		else {
			entityManager.persist(item);
		}
	}
	
	public void saveAll(Collection<Item> items) {
		for (Item item : items) {
			save(item);
		}
	}
}
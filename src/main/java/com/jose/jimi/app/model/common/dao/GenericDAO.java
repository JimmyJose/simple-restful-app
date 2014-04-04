package com.jose.jimi.app.model.common.dao;

import java.io.Serializable;
import java.util.Collection;

/**
 * Generic interface to be implemented or extended by the Data Access Objects.
 * Contains common persistence methods.
 * 
 * @author Jimmy Jose
 * @since April 2014
 */
public interface GenericDAO<T, ID extends Serializable> {
	
	/**
	 * Find an entity by its Id
	 * 
	 * @param id
	 * @return
	 */
	T findById(ID id);
	
	/**
	 * Find all the entities
	 * 
	 * @return
	 */
	Collection<T> findAll();
	
	/**
	 * Delete the entity
	 * 
	 * @param entity
	 */
	void delete(T entity);
	
	/**
	 * Save an entity
	 * 
	 * @param entity
	 * @return
	 */
	T save(T entity);
	
	/**
	 * Update an entity
	 * 
	 * @param entity
	 * @return
	 */
	T update(T entity);
	
	/**
	 * TODO:
	 */
	void flush();
}
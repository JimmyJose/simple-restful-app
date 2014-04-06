package com.jose.jimi.app.core.model.common.dao.jpa;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.jose.jimi.app.core.model.common.dao.GenericDAO;
import com.jose.jimi.app.core.model.common.domain.BaseEntity;

/**
 * Common implementation of the GenericDAO.
 * 
 * @author Jimmy Jose
 * @since April, 2014
 *
 * @param <T>
 * @param <ID>
 */
public class GenericJpaDAO<T, ID extends Serializable> implements GenericDAO<T, ID> {

	private Class<T> persistentClass;
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public GenericJpaDAO(Class<T> persistentClass) {
		this.persistentClass = persistentClass;
	}
	
	@Transactional(readOnly = true)
	public T findById(ID id) {
		return (T)entityManager.find(persistentClass, id);
	}

	@SuppressWarnings("unchecked")
	public Collection<T> findAll() {
		return entityManager.createQuery("select e from " + persistentClass.getSimpleName() + " e").getResultList();
	}

	public void delete(T entity) {
		if (BaseEntity.class.isAssignableFrom(persistentClass)) {
			entityManager.remove(entityManager.getReference(entity.getClass(), ((BaseEntity)entity).getId()));
		}
		else {
			entity = entityManager.merge(entity);
			entityManager.remove(entity);
		}
	}

	public T save(T entity) {
		entityManager.persist(entity);
		return entity;
	}

	public T update(T entity) {
		T mergedEntity = entityManager.merge(entity);
		return mergedEntity;
	}

	public void flush() {
		entityManager.flush();
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public Class<T> getPersistentClass() {
		return persistentClass;
	}

	public void setPersistentClass(Class<T> persistentClass) {
		this.persistentClass = persistentClass;
	}
}
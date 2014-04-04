package com.jose.jimi.app.model.dao.jpa;

import org.springframework.stereotype.Repository;

import com.jose.jimi.app.model.common.dao.jpa.GenericJpaDAO;
import com.jose.jimi.app.model.dao.ItemDAO;
import com.jose.jimi.app.model.domain.Item;

/**
 * TODO:
 * 
 * @author Jimmy Jose
 * @since April, 2014
 */
@Repository
public class ItemJpaDAO extends GenericJpaDAO<Item, Long> implements ItemDAO {

	public ItemJpaDAO() {
		super(Item.class);
	}
}
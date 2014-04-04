package com.jose.jimi.app.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jose.jimi.app.model.dao.ItemDAO;
import com.jose.jimi.app.model.domain.Item;

/**
 * TODO:
 * 
 * @author Jimmy Jose
 * @since April, 2014
 */
@Component
@Path("/items")
public class ItemResource {
	
	@Autowired
	ItemDAO itemDAO;
	
	@GET
	@Path("{id}")
	public String listItem(@PathParam("itemId") long itemId) {
		Item item = itemDAO.findById(itemId);
		if (item == null) {
			return "No item found!";
		}
		else {
			return "Item found!";
		}
	}
}
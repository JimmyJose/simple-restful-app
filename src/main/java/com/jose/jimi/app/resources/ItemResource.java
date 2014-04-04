package com.jose.jimi.app.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.springframework.stereotype.Component;

/**
 * TODO:
 * 
 * @author Jimmy Jose
 * @since April, 2014
 */
@Component
@Path("/items")
public class ItemResource {
	
	@GET
	@Path("{id}")
	public String listItem(@PathParam("itemId") long itemId) {
		return "Hello, World! " + itemId;
	}
}
package com.jose.jimi.app.rest.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jose.jimi.app.core.model.dao.MovieDAO;
import com.jose.jimi.app.core.model.domain.Movie;

/**
 * Resources for Movie
 * 
 * @author Jimmy Jose
 * @since April, 2014
 */
@Component
@Path("/movies")
public class MovieResource {
	
	@Autowired
	MovieDAO movieDAO;
	
	@GET
	@Path("{id}")
	public String listMovie(@PathParam("movieId") long movieId) {
		Movie item = movieDAO.findById(movieId);
		if (item == null) {
			return "No item found!";
		}
		else {
			return "Item found!";
		}
	}
}
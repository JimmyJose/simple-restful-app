package com.jose.jimi.app.rest.resources;

import java.util.ArrayList;
import java.util.Collection;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jose.jimi.app.core.dto.MovieDTO;
import com.jose.jimi.app.core.dto.MoviesDTO;
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
	
	// TODO: Validation, errorhandling and 404 etc
	@GET
	@Path("{id}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public MovieDTO listMovie(@PathParam("id") long movieId) {
		
		Movie movie = movieDAO.findById(movieId);
		if (movie != null) {
			return map(movie);
		}
		return null;
	}
	
	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public MoviesDTO listMovies() {
		Collection<Movie> movies = movieDAO.findAll();
		Collection<MovieDTO> dtos = new ArrayList<MovieDTO>();
		for (Movie movie : movies) {
			dtos.add(map(movie));
		}
		return new MoviesDTO(dtos);
	}
	
	private MovieDTO map(Movie movie) {
		MovieDTO dto = new MovieDTO();
		dto.setId(movie.getId());
		dto.setName(movie.getName());
		dto.setDescription(movie.getDescription());
		dto.setDirector(movie.getDirector());
		
		return dto;
	}
}
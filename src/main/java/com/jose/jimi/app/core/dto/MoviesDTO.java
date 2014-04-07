package com.jose.jimi.app.core.dto;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "movies")
public class MoviesDTO {
	
	private Collection<MovieDTO> movies;

	public MoviesDTO() {}
	
	public MoviesDTO(Collection<MovieDTO> movies) {
		this.movies = movies;
	}
	
	public Collection<MovieDTO> getMovies() {
		return movies;
	}

	public void setMovies(Collection<MovieDTO> movies) {
		this.movies = movies;
	}
}
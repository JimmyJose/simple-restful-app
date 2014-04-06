package com.jose.jimi.app.core.model.dao.jpa;

import org.springframework.stereotype.Repository;

import com.jose.jimi.app.core.model.common.dao.jpa.GenericJpaDAO;
import com.jose.jimi.app.core.model.dao.MovieDAO;
import com.jose.jimi.app.core.model.domain.Movie;

/**
 * Movie DAO JPA implementation
 * 
 * @author Jimmy Jose
 * @since April, 2014
 */
@Repository
public class MovieJpaDAO extends GenericJpaDAO<Movie, Long> implements MovieDAO {

	public MovieJpaDAO() {
		super(Movie.class);
	}
}
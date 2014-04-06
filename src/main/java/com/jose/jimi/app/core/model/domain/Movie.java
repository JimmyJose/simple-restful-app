package com.jose.jimi.app.core.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.jose.jimi.app.core.model.common.domain.BaseEntity;

/**
 * A domain object representing a Movie.
 * 
 * @author Jimmy Jose
 * @since April, 2014
 */
@Entity
@Table(name = "MOVIE")
public class Movie extends BaseEntity {
	
	@Column(name = "NAME")
	private String name;
	@Column(name = "DIRECTOR")
	private String director;
	@Column(name = "DESCRIPTION")
	private String description;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDirector() {
		return director;
	}
	
	public void setDirector(String director) {
		this.director = director;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
}
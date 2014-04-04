package com.jose.jimi.app.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.jose.jimi.app.model.common.domain.BaseEntity;

/**
 * TODO:
 * 
 * @author Jimmy Jose
 * @since April, 2014
 */
@Entity
@Table(name = "ITEM")
public class Item extends BaseEntity {
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
}
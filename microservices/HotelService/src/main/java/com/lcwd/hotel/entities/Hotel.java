package com.lcwd.hotel.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "MICRO-HOTELS")
public class Hotel {
	
	@Id
	@Column(name = "id")
	private String id;
	
	@Column(name = "name", length = 20)
	private String name;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "about")
	private String about;
	
}

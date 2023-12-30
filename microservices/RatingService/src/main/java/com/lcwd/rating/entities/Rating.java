package com.lcwd.rating.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "MICRO-RATINGS")
public class Rating {
	
	@Id
	@Column(name = "id")
	private String id;
	
	@Column(name = "user_id")
	private String userId;
	
	@Column(name = "hotel_id")
	private String hotelId;
	
	@Column(name = "rating")
	private int rating;
	
	@Column(name = "remark")
	private String remark;


}

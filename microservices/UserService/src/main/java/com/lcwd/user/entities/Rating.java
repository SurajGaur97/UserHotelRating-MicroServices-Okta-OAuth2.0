package com.lcwd.user.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Rating {
	
	private String id;
	private String userId;
	private String hotelId;
	private int rating;
	private String remark;
	
	private Hotel hotel;

}

package com.lcwd.rating.services;

import java.util.List;

import com.lcwd.rating.entities.Rating;


public interface RatingService {
	
	Rating saveRating(Rating rating);
	
	List<Rating> getAllRating();
	
	Rating getRating(String ratingId);
	
	void deleteRating(String ratingId);
	
	Rating updateRating(String ratingId);
	
	List<Rating> getRatingsByUserId(String userId);
	
	List<Rating> getRatingsByHotelId(String hotelId);

}

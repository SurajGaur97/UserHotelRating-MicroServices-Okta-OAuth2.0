package com.lcwd.rating.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcwd.rating.entities.Rating;
import com.lcwd.rating.exception.ResourceNotFoundException;
import com.lcwd.rating.repositories.RatingRepository;

@Service
public class RatingServiceImpl implements RatingService{
	
	@Autowired
	private RatingRepository ratingRepository;

	@Override
	public Rating saveRating(Rating rating) {
		String userId = UUID.randomUUID().toString();
		rating.setId(userId);
		return ratingRepository.save(rating);
	}

	@Override
	public List<Rating> getAllRating() {
		return ratingRepository.findAll();
	}

	@Override
	public Rating getRating(String ratingId) {
		return ratingRepository.findById(ratingId).orElseThrow(
				() -> new ResourceNotFoundException("Hotel with given id does not exist !! :" + ratingId));
	}

	@Override
	public void deleteRating(String ratingId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Rating updateRating(String ratingId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Rating> getRatingsByUserId(String userId) {
		return ratingRepository.findByUserId(userId);
	}

	@Override
	public List<Rating> getRatingsByHotelId(String hotelId) {
		return ratingRepository.findByHotelId(hotelId);
	}

}

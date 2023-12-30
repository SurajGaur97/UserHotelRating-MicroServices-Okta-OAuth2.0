package com.lcwd.rating.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lcwd.rating.entities.Rating;
import com.lcwd.rating.services.RatingService;

@RestController
@RequestMapping("/ratings")
public class RatingController {
	
	@Autowired
	private RatingService ratingService;

	@PostMapping("createRating")
	public ResponseEntity<Rating> createUser(@RequestBody Rating rating) {
		
		Rating rating1 = ratingService.saveRating(rating);
		return ResponseEntity.status(HttpStatus.CREATED).body(rating1);
		
	}
	
	@GetMapping("getAllRatings")
	public ResponseEntity<List<Rating>> getAllUsers() {
		
		List<Rating> ratings = ratingService.getAllRating();
		return ResponseEntity.status(HttpStatus.OK).body(ratings);
		
	}
	
	@GetMapping("getRating")
	public ResponseEntity<Rating> getAllUsers(@RequestParam String ratingId) {
		
		Rating rating = ratingService.getRating(ratingId);
		return ResponseEntity.status(HttpStatus.OK).body(rating);
		
	}
	
	@GetMapping("getRatingsByUserId")
	public ResponseEntity<List<Rating>> getRatingsByUserId(@RequestParam String userId) {
		
		List<Rating> rating = ratingService.getRatingsByUserId(userId);
		return ResponseEntity.status(HttpStatus.OK).body(rating);
		
	}
	
	@GetMapping("getRatingsByHotelId")
	public ResponseEntity<List<Rating>> getRatingsByHotelId(@RequestParam String hotelId) {
		
		List<Rating> rating = ratingService.getRatingsByHotelId(hotelId);
		return ResponseEntity.status(HttpStatus.OK).body(rating);
		
	}

}

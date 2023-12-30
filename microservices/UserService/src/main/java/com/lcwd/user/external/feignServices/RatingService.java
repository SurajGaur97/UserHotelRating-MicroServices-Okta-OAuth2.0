package com.lcwd.user.external.feignServices;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.lcwd.user.entities.Rating;

@FeignClient("RATING-SERVICE")
public interface RatingService {
	
	@PostMapping("/ratings/createRating")
	ResponseEntity<Rating> createRating(Rating rating);
	
	@PutMapping("/ratings/update")
	Rating updateRating(Rating rating);
	
	@DeleteMapping("ratings/delete")
	void deleteRating(String retingId);

}

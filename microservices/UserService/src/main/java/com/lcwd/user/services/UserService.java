package com.lcwd.user.services;

import java.util.List;

import com.lcwd.user.dto.UserResponceDto;
import com.lcwd.user.entities.Rating;
import com.lcwd.user.entities.User;

public interface UserService {
	
	User saveUser(User user);
	
	List<User> getAllUser();
	
	User getUser(String userId);
	
	void deleteUser(String userId);
	
	User updateUser(String userId);

	UserResponceDto getAllUserDetails(String userId);

	Rating saveRating(Rating rating);

}

package com.lcwd.hotel.services;

import java.util.List;

import com.lcwd.hotel.entities.Hotel;

public interface HotelService {
	
	Hotel saveHotel(Hotel Hotel);
	
	List<Hotel> getAllHotel();
	
	Hotel getHotel(String hotelId);
	
	void deleteHotel(String hotelId);
	
	Hotel updateHotel(String hotelId);

}

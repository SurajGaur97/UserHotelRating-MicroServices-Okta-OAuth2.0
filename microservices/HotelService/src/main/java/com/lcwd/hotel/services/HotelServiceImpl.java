package com.lcwd.hotel.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcwd.hotel.entities.Hotel;
import com.lcwd.hotel.exception.ResourceNotFoundException;
import com.lcwd.hotel.repositories.HotelRepository;

@Service
public class HotelServiceImpl implements HotelService{
	
	@Autowired
	private HotelRepository hotelRepository;

	@Override
	public Hotel saveHotel(Hotel hotel) {
		String userId = UUID.randomUUID().toString();
		hotel.setId(userId);
		return hotelRepository.save(hotel);
	}

	@Override
	public List<Hotel> getAllHotel() {
		return hotelRepository.findAll();
	}

	@Override
	public Hotel getHotel(String hotelId) {
		return hotelRepository.findById(hotelId).orElseThrow(
				() -> new ResourceNotFoundException("Hotel with given id does not exist !! :" + hotelId));
	}

	@Override
	public void deleteHotel(String hotelId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Hotel updateHotel(String hotelId) {
		// TODO Auto-generated method stub
		return null;
	}

}

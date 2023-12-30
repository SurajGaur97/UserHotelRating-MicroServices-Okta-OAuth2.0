package com.lcwd.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lcwd.hotel.entities.Hotel;
import com.lcwd.hotel.services.HotelService;

@RestController
@RequestMapping("/hotels")
public class HotelController {
	
	@Autowired
	private HotelService hotelService;
	
	/**
	 * @implNote: Here @PreAuthorize is used for accessing this API only by an authorized person whose scope is 
	 * 'internal'. And this scope is created by us at the time of creating OKTA application name 'internal'.  
	 * @param hotelId
	 * @return
	 */
	@PreAuthorize("hasAuthority('SCOPE_internal')")		//here SCOPE is the indicator of scope key and setting value inside it as 'internal'.
	@GetMapping("getHotel")
	public ResponseEntity<Hotel> getHotel(@RequestParam String hotelId) {
		
		Hotel Hotels = hotelService.getHotel(hotelId);
		return ResponseEntity.status(HttpStatus.OK).body(Hotels);
		
	}
	
	/**
	 * @implNote: Here @PreAuthorize is set to 'SCOPE_internal' or 'Admin' ie. it is only accessed by admin and 
	 * by the service which internally call this API (like it is called by USER-SERVICE). Otherwise we can not 
	 * access it directly by hitting this end-point with PostMan or other clients. 
	 * @return
	 */
	@PreAuthorize("hasAuthority('SCOPE_internal') || hasAuthority('Admin')")
	@GetMapping("getAllHotels")
	public ResponseEntity<List<Hotel>> getAllHotels() {
		
		List<Hotel> Hotels = hotelService.getAllHotel();
		return ResponseEntity.status(HttpStatus.OK).body(Hotels);
		
	}
	
	@PreAuthorize("hasAuthority('Admin')")	//Making this API accessible only by Admin user only.
	@PostMapping("createHotel")
	public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel) {
		
		Hotel Hotel1 = hotelService.saveHotel(hotel);
		return ResponseEntity.status(HttpStatus.CREATED).body(Hotel1);
		
	}

}

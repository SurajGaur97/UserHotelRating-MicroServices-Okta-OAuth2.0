package com.lcwd.hotel.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("staffs")
public class StaffController {

	@GetMapping("getAllStaffs")
	public ResponseEntity<List<String>> getAll() {
		
		return ResponseEntity.status(HttpStatus.OK).body(Arrays.asList("Ram", "Shyam", "Mohan", "Raman"));
		
	}
}

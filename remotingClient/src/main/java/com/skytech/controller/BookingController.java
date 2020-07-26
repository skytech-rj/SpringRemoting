package com.skytech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skytech.springRemoting.BookingException;
import com.skytech.springRemoting.CabBookingService;

@RestController
@RequestMapping(value = "/app")
public class BookingController {

	@Autowired
	CabBookingService bookingService;

	@GetMapping(value = "/booking/{pickUpLocation}")
	public ResponseEntity bookCab(@PathVariable("pickUpLocation") String pickUpLocation) throws BookingException {

		return ResponseEntity.accepted().body(bookingService.bookRide(pickUpLocation));
	}

}

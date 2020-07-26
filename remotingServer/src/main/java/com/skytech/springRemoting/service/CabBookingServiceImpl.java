package com.skytech.springRemoting.service;

import com.skytech.springRemoting.Booking;
import com.skytech.springRemoting.BookingException;
import com.skytech.springRemoting.CabBookingService;

public class CabBookingServiceImpl implements CabBookingService {

	@Override
	public Booking bookRide(String pickUpLocation) throws BookingException {
		if (Math.random() < 0.3) throw new BookingException("We couldn't find a cab for you. Please try after sometime.");
        return new Booking(java.util.UUID.randomUUID().toString());
	}

}

package com.skytech.springRemoting;

public interface CabBookingService {
	    Booking bookRide(String pickUpLocation) throws BookingException;
}
package com.skytech.springRemoting;

import java.io.Serializable;

public class Booking implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String bookingCode;

	public Booking() {
		super();
	}

	public Booking(String bookingCode) {
		super();
		this.bookingCode = bookingCode;
	}

	@Override
	public String toString() {
		return "Booking [bookingCode=" + bookingCode + "]";
	}

	public String getBookingCode() {
		return bookingCode;
	}

	public void setBookingCode(String bookingCode) {
		this.bookingCode = bookingCode;
	}

}

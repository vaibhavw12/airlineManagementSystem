package com.vaibhav.info;

public class CustomerBookings {
	private String source, destination, date, seats, time;
	public void bookings(String source,String destination,String date, String seats, String time) {
		
		this.source = source;
		this.destination = destination;
		this.date = date;
		this.seats = seats;
		this.time = time;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getSeats() {
		return seats;
	}
	public void setSeats(String seats) {
		this.seats = seats;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	
}

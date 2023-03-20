package com.movies.TicketBookin.service;

import java.util.List;

import com.movies.TicketBookin.entity.Booking;

public interface BookingService {

	public Booking fetchbyid(int id);

	public String deletebyid(int id);

	public Booking savebooking(Booking booking);

	public List<Booking> fetchbooking(Booking booking);

	public Booking updatebyid(Booking booking);
}

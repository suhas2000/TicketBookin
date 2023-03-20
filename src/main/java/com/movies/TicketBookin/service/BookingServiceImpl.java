package com.movies.TicketBookin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movies.TicketBookin.dao.BookingDAO;

import com.movies.TicketBookin.entity.Booking;

@Service
public class BookingServiceImpl implements BookingService {

	@Autowired
	private BookingDAO bookingdao;

	@Override
	public Booking fetchbyid(int id) {
		return bookingdao.fetchbyid(id);
	}

	@Override
	public String deletebyid(int id) {
		return bookingdao.deletebyid(id);

	}

	@Override
	public Booking savebooking(Booking booking) {
		return bookingdao.savebooking(booking);
	}

	@Override
	public List<Booking> fetchbooking(Booking booking) {
		return bookingdao.fetchbooking(booking);
	}

	@Override
	public Booking updatebyid(Booking booking) {

		return bookingdao.updatebyid( booking);
	}

}

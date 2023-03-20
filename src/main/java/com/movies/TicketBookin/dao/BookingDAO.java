package com.movies.TicketBookin.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.movies.TicketBookin.entity.Booking;

import com.movies.TicketBookin.repository.BookingRepository;
import com.movies.TicketBookin.repository.MovieRepository;

@Repository
public class BookingDAO {

	@Autowired
	public MovieRepository movieRepository;

	@Autowired
	public BookingRepository bookingRepository;

	public List<Booking> fetchbooking(Booking booking) {
		return bookingRepository.findAll();
	}

	public Booking fetchbyid(int id) {
		return bookingRepository.findById(id).orElse(null); // can use findByid(id).get() method too.
	}

	public String deletebyid(int id) {
		bookingRepository.deleteById(id);
		return "Deleted successfully";
	}

	public Booking savebooking(Booking booking) {
		return bookingRepository.save(booking);
	}

	public Booking updatebyid(Booking booking) {

//		if (Objects.nonNull(booking.getUserName()) && !"".equalsIgnoreCase(booking.getUserName())) {
//			bookingdb.setUserName(booking.getUserName());
//		}

		return bookingRepository.save(booking);
	}

}

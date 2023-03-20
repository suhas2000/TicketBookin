
package com.movies.TicketBookin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.movies.TicketBookin.entity.Booking;
import com.movies.TicketBookin.service.BookingService;

import jakarta.validation.Valid;

@RestController
public class BookingController {

	@Autowired
	private BookingService bookingservice;

	@GetMapping("/List_bookings") // Retrieve
	public List<Booking> fetchbooking(@RequestBody Booking booking) {
		return bookingservice.fetchbooking(booking);
	}

	@GetMapping("/get_booking/{id}") // Retrieve By id
	public Booking fetchbyid(@PathVariable("id") int id) {
		return bookingservice.fetchbyid(id);
	}

	@DeleteMapping("/delete_booking/{id}") // Delete by id
	public String deletebyid(@PathVariable("id") int id) {
		return bookingservice.deletebyid(id);
	}

	@PostMapping("/add_booking")
	public Booking savebooking(@RequestBody @Valid Booking booking) {
		return bookingservice.savebooking(booking);
	}

	@PutMapping("/update_booking")
	public Booking updatebyid(@Valid @RequestBody Booking booking) {
		return bookingservice.updatebyid( booking);
	}

}

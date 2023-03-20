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
import com.movies.TicketBookin.entity.Showtime;
import com.movies.TicketBookin.service.ShowtimeService;

import jakarta.validation.Valid;

@RestController
public class ShowtimeController {

	@Autowired
	private ShowtimeService showtimeService;

	@GetMapping("/List_showtime")
	public List<Showtime> fetchshowtime(@RequestBody Showtime showtime) {
		return showtimeService.fetchshowtime(showtime);
	}

	@PostMapping("/add_showtime")
	public Showtime saveshowtime(@Valid @RequestBody Showtime showtime) {
		return showtimeService.saveshowtime(showtime);
	}

	@DeleteMapping("/delete_showtime/{id}") // Delete by id
	public String deletebyid(@PathVariable("id") int id) {
		return showtimeService.deletebyid(id);
	}

	@GetMapping("/get_showtime/{id}")
	public Showtime getbiyd(@PathVariable int id) {
		return showtimeService.getbiyd(id);
	}

	@PutMapping("/update_showtime") // Update by id
	public Showtime update_byid(@Valid @RequestBody Showtime showtime) {
		return showtimeService.updatebyid(showtime);
	}
}

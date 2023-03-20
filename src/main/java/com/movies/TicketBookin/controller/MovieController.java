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
import com.movies.TicketBookin.entity.Movie;
import com.movies.TicketBookin.service.MovieService;

import jakarta.validation.Valid;

@RestController
public class MovieController {
	@Autowired
	private MovieService movieservice;

	@PostMapping("/add_movie") // Create
	public Movie savemovie(@Valid @RequestBody Movie movie) {
		return movieservice.savemovie(movie);
	}

	@GetMapping("/List_movies") // Retrieve
	public List<Movie> fetchmovie() {
		return movieservice.fetchmovie();
	}

	@GetMapping("/get_movie/{id}") // Retrieve By id
	public Movie fetchbyid(@PathVariable("id") int id) {
		return movieservice.fetchbyid(id);
	}

	@PutMapping("/update_movie") // Update by id
	public Movie updatebyid(@Valid @RequestBody Movie movie) {
		return movieservice.updatebyid(movie);
	}

	@DeleteMapping("/delete_movie/{id}") // Delete by id
	public void deletebyid(@PathVariable("id") int id) {
		movieservice.deletebyid(id);
	}
}

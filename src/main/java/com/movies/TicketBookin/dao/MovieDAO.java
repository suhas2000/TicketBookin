package com.movies.TicketBookin.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.movies.TicketBookin.entity.Movie;
import com.movies.TicketBookin.repository.MovieRepository;

@Repository
public class MovieDAO {

	@Autowired
	public MovieRepository movieRepository;

	public Movie savemovie(Movie movie) {

		return movieRepository.save(movie);
	}

	public List<Movie> fetchmovie() {
		return movieRepository.findAll();
	}

	public Movie fetchbyid(int id) {
		return movieRepository.findById(id).orElse(null); // can use findByid(id).get() method too.
	}

	public Movie updatebyid(Movie movie) {
		return movieRepository.save(movie);
	}

	public String deletebyid(int id) {
		movieRepository.deleteById(id);
		return "Deleted successfully";
	}
}

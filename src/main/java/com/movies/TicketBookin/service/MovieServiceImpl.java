package com.movies.TicketBookin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movies.TicketBookin.dao.MovieDAO;
import com.movies.TicketBookin.entity.Movie;

@Service
public class MovieServiceImpl implements MovieService {
	@Autowired
	private MovieDAO moviedao;

	@Override
	public Movie savemovie(Movie movie) {
		return moviedao.savemovie(movie);
	}

	@Override
	public List<Movie> fetchmovie() {
		return moviedao.fetchmovie();
	}

	@Override
	public Movie fetchbyid(int id) {
		return moviedao.fetchbyid(id);
	}

	@Override
	public Movie updatebyid(Movie movie) {

		return moviedao.updatebyid(movie);
	}

	@Override
	public String deletebyid(int id) {
		return moviedao.deletebyid(id);

	}
}

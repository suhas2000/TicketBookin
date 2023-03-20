package com.movies.TicketBookin.service;

import java.util.List;
import com.movies.TicketBookin.entity.Movie;

public interface MovieService {

	public Movie savemovie(Movie movie);

	public List<Movie> fetchmovie();

	public Movie fetchbyid(int id);

	public Movie updatebyid(Movie movie);

	public String deletebyid(int id);
}

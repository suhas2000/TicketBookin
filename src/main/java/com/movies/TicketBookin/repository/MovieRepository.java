package com.movies.TicketBookin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movies.TicketBookin.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer> {

}

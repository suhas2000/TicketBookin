package com.movies.TicketBookin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movies.TicketBookin.entity.Showtime;

public interface ShowtimeRepository extends JpaRepository<Showtime, Integer> {

}

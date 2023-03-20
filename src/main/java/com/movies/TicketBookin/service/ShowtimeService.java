package com.movies.TicketBookin.service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.movies.TicketBookin.entity.Showtime;

@Service
public interface ShowtimeService {

	List<Showtime> fetchshowtime(Showtime showtime);

	Showtime saveshowtime(Showtime showtime);

	Showtime fetchbyid(int id);

	String deletebyid(int id);

	Showtime getbiyd(int id);

	Showtime updatebyid(Showtime showtime);

}

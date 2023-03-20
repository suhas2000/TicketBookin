package com.movies.TicketBookin.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.movies.TicketBookin.entity.Showtime;
import com.movies.TicketBookin.repository.ShowtimeRepository;

@Repository
public class ShowtimeDAO {

	@Autowired
	public ShowtimeRepository showtimeRepository;

	public List<Showtime> fetchshowtime(Showtime showtime) {
		return showtimeRepository.findAll();
	}

	public Showtime saveshowtime(Showtime showtime) {
		return showtimeRepository.save(showtime);
	}

	public Showtime fetchbyid(int id) {
		return showtimeRepository.findById(id).get();
	}

	public String deletebyid(int id) {
		showtimeRepository.deleteById(id);
		return "Deleted successfully";
	}

	public Showtime getbiyd(int id) {
		return showtimeRepository.findById(id).get();

	}

	public Showtime updatebyid(Showtime showtime) {
		return showtimeRepository.save(showtime);
	}
}

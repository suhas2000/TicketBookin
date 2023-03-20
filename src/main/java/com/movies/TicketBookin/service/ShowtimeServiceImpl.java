package com.movies.TicketBookin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movies.TicketBookin.dao.ShowtimeDAO;

import com.movies.TicketBookin.entity.Showtime;

@Service
public class ShowtimeServiceImpl implements ShowtimeService {

	@Autowired
	private ShowtimeDAO showtimedao;

	@Override
	public List<Showtime> fetchshowtime(Showtime showtime) {
		return showtimedao.fetchshowtime(showtime);
	}

	@Override
	public Showtime saveshowtime(Showtime showtime) {
		return showtimedao.saveshowtime(showtime);
	}

	@Override
	public Showtime fetchbyid(int id) {
		return showtimedao.fetchbyid(id);
	}

	@Override
	public String deletebyid(int id) {
		return showtimedao.deletebyid(id);

	}

	@Override
	public Showtime getbiyd(int id) {
		return showtimedao.getbiyd(id);
	}

	@Override
	public Showtime updatebyid(Showtime showtime) {

		return showtimedao.updatebyid( showtime);
	}
}

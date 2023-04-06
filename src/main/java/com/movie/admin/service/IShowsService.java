package com.movie.admin.service;

import java.util.List;

import com.movie.admin.dto.ShowsDTO;
import com.movie.admin.entity.Shows;
import com.movie.admin.exception.MovieException;

public interface IShowsService {

	public Shows addShow(ShowsDTO shows) throws MovieException;
	
	public Shows updateShow(Shows shows);
	
	public void deleteShows(int id);
	
	public List<Shows> getAllShows();
	
	public Shows getTheatreById(int id);
	
}

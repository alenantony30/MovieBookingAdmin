package com.movie.admin.service;

import java.util.List;

import com.movie.admin.dto.TheatresDTO;
import com.movie.admin.entity.Theatres;

public interface ITheatresService {
	

	public Theatres addTheatre(TheatresDTO theatredto);
	
	public Theatres updateTheatre(Theatres theatre);
	
	public void deleteTheatres(int id);
	
	public List<Theatres> getAllTheatres();
	
	public Theatres getTheatreById(int id);

}

package com.movie.admin.service;

import java.util.List;

import com.movie.admin.dto.MoviesDTO;
import com.movie.admin.entity.Movies;

public interface IMoviesService {
	
	public Movies addMovie(MoviesDTO moviesdto);
	
	public Movies updateMovie(Movies moviesdto);
	
	public void deleteMovies(int id);
	
	public List<Movies> getAllMovies();
	
	public Movies getMovieById(int id);
}

package com.movie.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.admin.dto.MoviesDTO;
import com.movie.admin.entity.Movies;
import com.movie.admin.repo.IMoviesRepo;

@Service
public class MovieService implements IMoviesService {

	
	@Autowired
	IMoviesRepo movieRepo;
	
	@Override
	public Movies addMovie(MoviesDTO moviesdto) {
		// TODO Auto-generated method stub
		Movies movie=new Movies();
		
		movie.setDirector(moviesdto.getDirector());
		movie.setDuration(moviesdto.getDuration());
		movie.setGenre(moviesdto.getGenre());
		movie.setMovieTitle(moviesdto.getMovieTitle());
		movie.setRating(0);
		
		return movieRepo.save(movie);
	}

	@Override
	public Movies updateMovie(Movies movies) {

		return movieRepo.save(movies);
	}

	@Override
	public void deleteMovies(int id) {
		// TODO Auto-generated method stub
		movieRepo.deleteById(id);
	}

	@Override
	public List<Movies> getAllMovies() {
		// TODO Auto-generated method stub
		return movieRepo.findAll();
	}

	@Override
	public Movies getMovieById(int id) {
		// TODO Auto-generated method stub
		return movieRepo.findById(id).orElse(null);
	}

}

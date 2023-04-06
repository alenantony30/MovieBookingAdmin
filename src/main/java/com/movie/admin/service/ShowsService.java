package com.movie.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.admin.dto.ShowsDTO;
import com.movie.admin.entity.Movies;
import com.movie.admin.entity.Shows;
import com.movie.admin.entity.Theatres;
import com.movie.admin.exception.MovieException;
import com.movie.admin.repo.IMoviesRepo;
import com.movie.admin.repo.IShowsRepo;
import com.movie.admin.repo.ITheatresRepo;

@Service
public class ShowsService implements IShowsService {

	@Autowired
	IShowsRepo showRepo;
	
	@Autowired
	IMoviesRepo movieRepo;
	
	@Autowired
	ITheatresRepo theatreRepo;

	@Override
	public Shows addShow(ShowsDTO showdto) throws MovieException {
		// TODO Auto-generated method stub
		
		Shows show=new Shows();
		Movies movie= movieRepo.findById(showdto.getMovieId()).orElse(null);
		Theatres theatre =theatreRepo.findById(showdto.getTheatreId()).orElse(null);
		
		if(movie!=null&& show!=null) {
		
		show.setAvailableSeats(showdto.getAvailableSeats());
		show.setShowDate(showdto.getShowDate());
		show.setShowTime(showdto.getShowTime());
		show.setMovie(movie);
		show.setTheatre(theatre);
		
		return showRepo.save(show);
		
		}else {
			System.out.println("Cannot find Movie or Theatre");
			throw new MovieException("Cannot find Movie or Theatre");
			//return null;
		}
		
		
	}

	@Override
	public Shows updateShow(Shows shows) {
		// TODO Auto-generated method stub
		return showRepo.save(shows);
	}

	@Override
	public void deleteShows(int id) {
		// TODO Auto-generated method stub
		showRepo.deleteById(id);
	}

	@Override
	public List<Shows> getAllShows() {
		// TODO Auto-generated method stub
		return showRepo.findAll();
	}

	@Override
	public Shows getTheatreById(int id) {
		// TODO Auto-generated method stub
		return showRepo.findById(id).orElse(null);
	}

}

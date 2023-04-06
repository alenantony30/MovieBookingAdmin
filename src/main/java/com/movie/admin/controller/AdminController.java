package com.movie.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.admin.dto.MoviesDTO;
import com.movie.admin.dto.ShowsDTO;
import com.movie.admin.dto.TheatresDTO;
import com.movie.admin.entity.Movies;
import com.movie.admin.entity.Shows;
import com.movie.admin.entity.Theatres;
import com.movie.admin.exception.MovieException;
import com.movie.admin.service.IMoviesService;
import com.movie.admin.service.IShowsService;
import com.movie.admin.service.ITheatresService;

@RestController
@RequestMapping("/movies/admin")
public class AdminController {

	@Autowired
	IMoviesService movieService;

	@Autowired
	IShowsService showService;

	@Autowired
	ITheatresService theatreService;

	@GetMapping("/getallmovies")
	public List<Movies> getAllMovies() {
		return movieService.getAllMovies();
	}

	@PostMapping("/addmovie")
	public Movies addMovie(@RequestBody MoviesDTO moviedto) {
		return movieService.addMovie(moviedto);
	}

	@PutMapping("/updatemovie")
	public Movies updateMovie(@RequestBody Movies movie) {
		return movieService.updateMovie(movie);
	}

	@DeleteMapping("/deletemovie/{id}")
	public void deleteMovie(@PathVariable int id) throws MovieException {

		if (movieService.getMovieById(id) != null) {
			movieService.deleteMovies(id);
		}else {
			System.out.println("Cannot find the Movie ID");
			throw new MovieException("Cannot find the Movie ID");
			
		}
	}

/////////////////////////////////////////////////////
	@GetMapping("/getallshows")
	public List<Shows> getAllShows() {
		return showService.getAllShows();
	}

	@PostMapping("/addshow")
	public Shows addShow(@RequestBody ShowsDTO showdto) throws MovieException {
		return showService.addShow(showdto);
	}

	@PutMapping("/updateshow")
	public Shows updateShow(@RequestBody Shows show) {
		return showService.updateShow(show);
	}

	@DeleteMapping("/deleteshow/{id}")
	public void deleteShow(@PathVariable int id) throws MovieException {

		if (showService.getTheatreById(id) != null) {
			showService.deleteShows(id);
		} else {
			System.out.println("Cannot find the Show ID");
			throw new MovieException("Cannot find the Show ID");
		}
	}
	//////////////////////////////////

	@GetMapping("/getalltheatres")
	public List<Theatres> getAllTheatres() {
		return theatreService.getAllTheatres();
	}

	@PostMapping("/addtheatre")
	public Theatres addTheatre(@RequestBody TheatresDTO theatresdto) {
		return theatreService.addTheatre(theatresdto);
	}

	@PutMapping("/updatetheatre")
	public Theatres updateTheatre(@RequestBody Theatres theatre) {
		return theatreService.updateTheatre(theatre);
	}

	@DeleteMapping("/deletethreatre/{id}")
	public void deleteTheatre(@PathVariable int id) throws MovieException {

		if (theatreService.getTheatreById(id) != null) {

			theatreService.deleteTheatres(id);
		} else {

			System.out.println("Cannot find the Theatre ID");
			throw new MovieException("Cannot find the Theatre ID");

		}
	}

}

package com.movie.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.admin.dto.TheatresDTO;
import com.movie.admin.entity.Theatres;
import com.movie.admin.repo.ITheatresRepo;



@Service
public class TheatreService implements ITheatresService {
	
	@Autowired
	ITheatresRepo theatreRepo;

	@Override
	public Theatres addTheatre(TheatresDTO theatredto) {
		// TODO Auto-generated method stub
		
		Theatres theatre =new Theatres();
		theatre.setLocation(theatredto.getLocation());
		theatre.setSeatingCapacity(theatredto.getSeatingCapacity());
		theatre.setTheatreName(theatredto.getTheatreName());
		theatre.setTicketPrice(theatredto.getTicketPrice());
		return theatreRepo.save(theatre);
	}

	@Override
	public Theatres updateTheatre(Theatres theatre) {
		// TODO Auto-generated method stub
		return theatreRepo.save(theatre);
	}

	@Override
	public void deleteTheatres(int id) {
		// TODO Auto-generated method stub
		theatreRepo.deleteById(id);
	}


	@Override
	public List<Theatres> getAllTheatres() {
		// TODO Auto-generated method stub
		return theatreRepo.findAll();
	}

	@Override
	public Theatres getTheatreById(int id) {
		// TODO Auto-generated method stub
		return theatreRepo.findById(id).orElse(null);
	}

}

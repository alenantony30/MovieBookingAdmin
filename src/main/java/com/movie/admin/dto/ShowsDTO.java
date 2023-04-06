package com.movie.admin.dto;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.movie.admin.entity.Movies;
import com.movie.admin.entity.Theatres;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class ShowsDTO {

	//int showId;
	int  theatreId;
	int movieId;
	Date showDate;
	Time showTime;
	int availableSeats;

}

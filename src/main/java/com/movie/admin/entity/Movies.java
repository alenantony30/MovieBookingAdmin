package com.movie.admin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="movies")
public class Movies {
	@Id
	@Column(name="movie_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	int movieId;
	@Column(name="movie_title")
	String movieTitle;
	String genre;
	String director;
	int duration;
	double rating;

}

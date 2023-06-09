package com.movie.admin.entity;

import java.sql.Date;
import java.sql.Time;

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
@Table(name="theatres")
public class Theatres {
	

	@Id
	 @Column(name="theatre_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	 int theatreId;
	 @Column(name="theatre_name")
	 String theatreName;
	 @Column(name="location")
	 String location;
	 @Column(name="seating_capacity")
	 int seatingCapacity;
	 @Column(name="ticket_price")
	 double ticketPrice;

}

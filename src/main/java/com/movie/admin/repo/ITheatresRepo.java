package com.movie.admin.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movie.admin.entity.Theatres;

public interface ITheatresRepo extends JpaRepository<Theatres, Integer> {

}

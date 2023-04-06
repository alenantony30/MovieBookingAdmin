package com.movie.admin.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movie.admin.entity.Movies;

public interface IMoviesRepo extends JpaRepository<Movies, Integer> {

}

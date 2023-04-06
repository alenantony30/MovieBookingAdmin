package com.movie.admin.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movie.admin.entity.Shows;

public interface IShowsRepo  extends JpaRepository<Shows, Integer> {

}

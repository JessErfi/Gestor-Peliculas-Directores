package com.catalogo.peliculas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.catalogo.peliculas.model.MovieModel;

public interface MovieRepository extends JpaRepository<MovieModel, Integer> {

}

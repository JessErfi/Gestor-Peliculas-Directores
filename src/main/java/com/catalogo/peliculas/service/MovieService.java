package com.catalogo.peliculas.service;

import java.util.List;
import com.catalogo.peliculas.dto.MovieDto;
import com.catalogo.peliculas.model.MovieModel;
import com.catalogo.peliculas.repository.MovieRepository;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<MovieDto> getAllMovies() {
        return movieRepository.findAll().stream()
                .map(MovieModel::toMovieDto).toList();
    }

    public MovieDto addMovie(MovieDto movieDto) {
        MovieModel movieModel = movieDto.toMoviesModel();
        MovieModel savedMovie = movieRepository.save(movieModel);
        return savedMovie.toMovieDto();
    }

}

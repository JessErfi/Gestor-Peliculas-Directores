package com.catalogo.peliculas.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import com.catalogo.peliculas.model.MovieModel;

@Builder 
@AllArgsConstructor 
@Data 
public class MovieDto {

    Integer id;
    String title;
    String director;
    String genre;
    String duration_minutes;

    public MovieModel toMoviesModel() {
        return MovieModel.builder()
                .id(this.id)
                .title(this.title)
                .director(this.director)
                .genre(this.genre)
                .duration_minutes(this.duration_minutes)
                .build();
    }

}

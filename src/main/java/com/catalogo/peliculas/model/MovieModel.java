package com.catalogo.peliculas.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;
import com.catalogo.peliculas.dto.MovieDto;

@Data 
@Builder
@AllArgsConstructor 
@NoArgsConstructor
@Entity
@Table(name = "movies")
public class MovieModel {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer id;

    @Column(name = "title")
    String title;

    @Column(name = "director")
    String director;

    @Column(name = "genre")
    String genre;

    @Column(name = "duration_minutes")
    String duration_minutes;

    public MovieDto toMovieDto() {
        return MovieDto.builder()
                .id(this.id)
                .title(this.title)
                .director(this.director)
                .genre(this.genre)
                .duration_minutes(this.duration_minutes)
                .build();
    }

}

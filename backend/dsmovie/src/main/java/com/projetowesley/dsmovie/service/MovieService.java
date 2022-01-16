package com.projetowesley.dsmovie.service;

import com.projetowesley.dsmovie.dto.MovieDTO;
import com.projetowesley.dsmovie.entities.Movie;
import com.projetowesley.dsmovie.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class MovieService{

    @Autowired
    private MovieRepository movieRepository;

    @Transactional
    public Page<MovieDTO> findAll(Pageable pageable){
       Page<Movie> movies = movieRepository.findAll(pageable);
       Page<MovieDTO> page = movies.map(x -> new MovieDTO(x));
       return page;
  }

   @Transactional
    public MovieDTO findById(Long id){

        Movie movie = movieRepository.findById(id).get();
        MovieDTO movieDTO = new MovieDTO(movie);

        return movieDTO;

   }

}

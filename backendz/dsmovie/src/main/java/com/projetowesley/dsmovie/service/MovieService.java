package com.projetowesley.dsmovie.service;

import com.projetowesley.dsmovie.dto.MovieDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService{

    @Autowired
    private MovieRepository movieRepository;

    public List<MovieDTO> findAll(

            return movieRepository

    )

}

package com.projetowesley.dsmovie.service;

import com.projetowesley.dsmovie.dto.MovieDTO;
import com.projetowesley.dsmovie.dto.ScoreDTO;
import com.projetowesley.dsmovie.entities.Movie;
import com.projetowesley.dsmovie.entities.Score;
import com.projetowesley.dsmovie.entities.User;
import com.projetowesley.dsmovie.repositories.MovieRepository;
import com.projetowesley.dsmovie.repositories.ScoreRepository;
import com.projetowesley.dsmovie.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ScoreService {

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ScoreRepository scoreRepository;

    @Transactional
    public MovieDTO SaveScore(ScoreDTO scoreDTO){

        User user = userRepository.findByEmail(scoreDTO.getEmail());
        if(user == null){

            user = new User();
            user.setEmail(scoreDTO.getEmail());
            user = userRepository.saveAndFlush(user);


        }

        Movie movie = movieRepository.findById(scoreDTO.getMovieId()).get();

        Score score = new Score();
        score.setMovie(movie);
        score.setUser(user);
        score.setValue(scoreDTO.getScore());

        score = scoreRepository.saveAndFlush(score);

        double sum = 0.0;

        for(Score s : movie.getScores()){

            sum = sum + s.getValue();
        }

        double avg = sum / movie.getScores().size();

        movie.setScore(avg);
        movie.setCount(movie.getScores().size());

        movie = movieRepository.save(movie);

        return new MovieDTO(movie);
    }


}

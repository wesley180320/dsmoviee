package com.projetowesley.dsmovie.Controller;

import com.projetowesley.dsmovie.dto.MovieDTO;
import com.projetowesley.dsmovie.dto.ScoreDTO;
import com.projetowesley.dsmovie.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {

    @Autowired
    private ScoreService scoreService;

    @PutMapping
    public MovieDTO saveScorea(@RequestBody ScoreDTO scoreDTO){

        MovieDTO movieDTO = scoreService.SaveScore(scoreDTO);

        return movieDTO;
    }

}

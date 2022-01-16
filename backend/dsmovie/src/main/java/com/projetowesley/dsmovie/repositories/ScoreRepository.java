package com.projetowesley.dsmovie.repositories;

import com.projetowesley.dsmovie.entities.Score;
import com.projetowesley.dsmovie.entities.ScorePK;
import com.projetowesley.dsmovie.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
}

package com.sebastian.garcia.game.service;

import com.sebastian.garcia.game.model.LEVEL;
import com.sebastian.garcia.game.model.Round;
import java.util.ArrayList;
import java.util.List;

public class GameService {

    public List<Round> getRounds() {
        List<Round> rounds = new ArrayList<>();

        Round round1 = new Round();
        round1.setLevel(LEVEL.ONE.getValue());
        round1.setScoreTowin(1000);

        Round round2 = new Round();
        round2.setLevel(LEVEL.TWO.getValue());
        round2.setScoreTowin(1000);

        Round round3 = new Round();
        round3.setLevel(LEVEL.THREE.getValue());
        round3.setScoreTowin(1000);

        Round round4 = new Round();
        round4.setLevel(LEVEL.FOUR.getValue());
        round4.setScoreTowin(1000);

        Round round5 = new Round();
        round5.setLevel(LEVEL.FIVE.getValue());
        round5.setScoreTowin(5000);

        rounds.add(round1);
        rounds.add(round2);
        rounds.add(round3);
        rounds.add(round4);
        rounds.add(round5);

        return rounds;
    }
}

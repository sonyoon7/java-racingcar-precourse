package racingcar.rounds;

import racingcar.cars.Cars;

import java.util.ArrayList;
import java.util.List;

public class Rounds {

    private List<Round> rounds;

    public Rounds(List<Round> rounds) {
        this.rounds = rounds;
    }

    public Rounds playRacingCars(Cars cars , int currentRound){
        ArrayList<Round> rounds = new ArrayList<>();
        Round round = new Round(cars.race(), currentRound );
        return new Rounds(rounds);
    }
}

package racingcar.rounds;

import racingcar.cars.Car;
import racingcar.cars.Cars;

import java.util.ArrayList;
import java.util.List;

public class Rounds {

    private List<Round> rounds;

    public Rounds(List<Round> rounds) {
        this.rounds = rounds;
    }

    /*
    TODO
    1. 랜덤 수 전진 후진 판단
    2. 자동차 위치 업데이트
    3. Round 객체에 담기
    */
    public Rounds playRacingCars(Cars cars , int currentRound){
        ArrayList<Round> rounds = new ArrayList<>();

        for (Car car : cars.getCars()) {

        }
        Round round = new Round(cars, currentRound );

        return new Rounds(rounds);
    }
}

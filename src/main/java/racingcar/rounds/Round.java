package racingcar.rounds;

import racingcar.cars.Cars;

public class Round {

    private Cars car;
    private int  currentRoundCount;

    public Round(Cars car, int currentRoundCount) {
        this.car = car;
        this.currentRoundCount = currentRoundCount;
    }

    public Cars getCar() {
        return car;
    }

    public int getCurrentRoundCount() {
        return currentRoundCount;
    }
}

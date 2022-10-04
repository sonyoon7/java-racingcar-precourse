package racingcar.cars;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private static final String SEPARATOR = ",";

    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public static Cars generateRacingCarsFromInputString(String input) throws Exception {
        String[] nameArr = input.split(SEPARATOR);
        List<Car> cars = new ArrayList<>();
        for (String name : nameArr) {
            cars.add(new Car(name));
        }
        return new Cars(cars);
    }

    public List<Car> getCars() {
        return this.cars;
    }
}

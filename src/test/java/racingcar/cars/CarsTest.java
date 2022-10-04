package racingcar.cars;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;

public class CarsTest {

    @Test
    void 자동차_이름_입력() throws Exception {
        String input ="pobi,javaj,crong,honux";
        Cars cars = Cars.generateRacingCarsFromInputString(input);
        List<Car> racingCarList =  cars.getCars();

        assertAll(
                ()-> Assertions.assertThat(racingCarList.get(0).getName()).isEqualTo("pobi"),
                ()-> Assertions.assertThat(racingCarList.get(1).getName()).isEqualTo("javaj"),
                ()-> Assertions.assertThat(racingCarList.get(2).getName()).isEqualTo("crong"),
                ()-> Assertions.assertThat(racingCarList.get(3).getName()).isEqualTo("honux")
        );


    }
}

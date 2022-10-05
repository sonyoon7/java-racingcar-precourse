package racingcar.cars;

public class Car {

    private static final int MAX_OF_NAME_LENGTH = 5;
    private static final int MOVE = 1;

    private final String name;

    private int location;

    public Car(String name) throws Exception {
        checkValidation(name);
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getLocation() {
        return this.location;
    }

    public void setLocation(boolean isForward) {
        if (isForward) this.location += MOVE;
    }

    private void checkValidation(String name) throws Exception {
        if (name.length() > MAX_OF_NAME_LENGTH) {
            throw new Exception("자동차 이름은 "+ MAX_OF_NAME_LENGTH + "자 이하만 가능하다.");
        }
    }

}

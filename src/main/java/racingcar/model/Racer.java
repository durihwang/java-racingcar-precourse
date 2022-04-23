package racingcar.model;

public class Racer {

    private String name;

    public Racer(String name) {
        validateLength(name);
        this.name = name;
    }

    private void validateLength(String name) {
        if (name.length() < 1 || name.length() > 5) {
            throw new IllegalArgumentException("[ERROR] 자동차의 이름은 1~5자 이하여야 합니다.");
        }
    }
}

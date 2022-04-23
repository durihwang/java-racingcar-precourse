package racingcar.model;

public class Labs {

    private String lab;

    public Labs(String lab) {
        validate(lab);
        this.lab = lab;
    }

    public void validate(String lab) {
        if (!lab.matches("[+-]?\\d*(\\.\\d+)?")) {
            throw new IllegalArgumentException("[ERROR] 시도 횟수는 숫자여야 합니다.");
        }
    }
}

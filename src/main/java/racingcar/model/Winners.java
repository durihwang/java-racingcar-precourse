package racingcar.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Winners {

    private List<Racer> winners;

    public Winners(List<Racer> winners) {
        this.winners = winners;
    }

    public List<String> getArrayListStringWinners() {
        List<String> strings = new ArrayList<>();
        for (Racer racer : this.winners) {
            strings.add(racer.getName());
        }
        return strings;
    }

    public void printWinners() {
        StringBuilder builder = new StringBuilder();
        builder.append("최종 우승자: ");
        builder.append(String.join(",", getArrayListStringWinners()));
        System.out.println(builder);
    }
}

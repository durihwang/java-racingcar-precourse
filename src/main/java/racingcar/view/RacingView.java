package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.model.Labs;
import racingcar.model.Racer;
import racingcar.model.Racers;

import java.util.ArrayList;

public class RacingView {

    public Racers getCarName() {

        ArrayList<Racer> racer = new ArrayList<>();
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String readLine = Console.readLine();
        System.out.println(readLine);

        String[] names = readLine.split(",");
        for (String s : names) {
            racer.add(new Racer(s));
        }

        return new Racers(racer);
    }

    public Labs getLabs() {

        System.out.println("시도할 회수는 몇회인가요?");
        String readLine = Console.readLine();
        System.out.println(readLine);
        return new Labs(readLine);
    }

}

package racingcar.controller;

import racingcar.model.Attempts;
import racingcar.model.Racers;
import racingcar.model.Racing;
import racingcar.view.RacingView;


public class RacingController {

    Racers racers;
    Attempts attempts;
    Racing racing;

    public void run() {

        try {
            RacingView racingView = new RacingView();
            racers = racingView.getCarName();
            racing = new Racing(racers);
            while (true) {
                try {
                    attempts = racingView.getAttempts();
                    racing.result(attempts);
                    break;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

package racingcar.controller;

import racingcar.model.Labs;
import racingcar.model.Racers;
import racingcar.view.RacingView;


public class RacingController {

    public void run() {

        RacingView racingView = new RacingView();

        while (true) {
            try {
                Racers racers = racingView.getCarName();
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                Labs labs = racingView.getLabs();
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

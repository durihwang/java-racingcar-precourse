package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class Racers {

    private List<Racer> racers;

    public Racers(List<Racer> racers) {
        this.racers = racers;
    }

    public List<Racer> getRacers() {
        return racers;
    }

    public void race() {
        getRacers().forEach(Racer::setLabs);
        raceResult();
    }

    public void raceResult() {
        getRacers().forEach(Racer::printLabs);
    }

    public Winners winner() {

        ArrayList<Racer> winnerRacer = new ArrayList<>();
        for (Racer racer : getRacers()) {
            winnerRacer.add(isSameMax(getMaxLabs(), racer));
            winnerRacer.remove(null);
        }
        return new Winners(winnerRacer);
    }

    public Racer isSameMax(int max, Racer racer) {
        if (max == racer.getLabs()) {
            return racer;
        }
        return null;
    }

    public int getMaxLabs() {
        int max = Integer.MIN_VALUE;
        for (Racer racer : getRacers()) {
            max = Math.max(max, racer.getLabs());
        }
        return max;
    }
}

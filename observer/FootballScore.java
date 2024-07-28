package observer;

import java.util.ArrayList;
import java.util.List;

public class FootballScore  implements Subject {
    private List<Observer> observers;
    private String score;

    public FootballScore() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(score);
        }
    }

    public void setScore(String score) {
        this.score = score;
        notifyObservers();
    }
}

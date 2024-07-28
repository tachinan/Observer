package observer;

public class LiveResultDisplay implements Observer{

    @Override
    public void update(String score) {
        System.out.println("live result: " + score);
    }
}

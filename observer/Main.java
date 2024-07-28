package observer;

import java.util.Scanner;

public class Main {
      public static void main(String[] args) {
        FootballScore footballScore = new FootballScore();

        Observer display1 = new LiveResultDisplay();
        Observer display2 = new LiveResultDisplay();

        footballScore.registerObserver(display1);
        footballScore.registerObserver(display2);

        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("Enter Score: ");
            input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            footballScore.setScore(input);
        }

        scanner.close();
    }
}

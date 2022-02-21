package opdrachten;

import java.util.Scanner;

public class GuessApp {
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);
        HigherLowerGame game = new HigherLowerGame(20);

        System.out.println("Please guess a number between 0 and 20:");

        int result = 0;

        do {
            int guessValue = kbd.nextInt();
            result = game.guess(guessValue);

            switch (result){
                case 1:
                    System.out.println("lower");
                    break;
                case -1:
                    System.out.println("higher");
                    break;
                case 0:
                    System.out.println("Good guess!");
                    break;
            }

        } while (result != 0);

    kbd.close();
    }

}

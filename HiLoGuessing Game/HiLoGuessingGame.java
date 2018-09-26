import java.util.Scanner;

public class HiLoGuessingGame {
    public static void main(String[] arg) {

        int niki = ((int) (Math.random() * 100 + 0));
        boolean incorrect = true;
        int checkGuess = 0;
        while (incorrect) {
            Scanner hilo = new Scanner(System.in);
            System.out.println("Hey guess a number between 1 & 100, enter 0 if you want to quit the game");
            int user = hilo.nextInt();

            if (user == 0) {
                System.out.println("bye!");
                break;
            }
            if (user > 100 || user < 0) {
                System.out.println("Hey I said a number between 0 & 100");
                continue;
            }

            if (user < niki) {
                System.out.println("Ha the number is too low");
                checkGuess = checkGuess + 1;
            } else if (user > niki) {
                System.out.println("Whoops! Too high!");
                checkGuess = checkGuess + 1;
            } else {
                if (checkGuess == 1) {
                    System.out.println("Wow you guessed it in " + checkGuess + " try");
                } else {
                    System.out.println("Wow you guessed it in " + checkGuess + " tries");
                }
                System.out.println("Play again? Hit any number to play, but 0 to quit!");
                int again = hilo.nextInt();
                if (again == 0) {
                    incorrect = false;
                }
            }
        }
    }
}

import java.util.Scanner;

public class HiLoGuessingGame {
    public static void main (String[] arg) {

        int niki = ((int)(Math.random() *100 + 0));
        Scanner hilo = new Scanner(System.in);
        System.out.println("Hey guess a number between 0 & 100 :)");
        int user = hilo.nextInt ();
      /*  if (user > 100 || user < 0) {
          System.out.println ("Hey I said a number between 0 & 100");
        }
        else {
          System.out.println ("Hey I said a number between 0 & 100");
          */
          //   for (int i = 0; i < niki; i++) {

        if (user > niki) {
            System.out.println("Ha the number is too low");

        }
        else if (user < niki) {
            System.out.println("Whoops! Too high!");
        }
        else if (user == niki) {
            System.out.println ("Wow you guessed it");
    }
}
}

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main (String[] arg) {
        String[] object = {"Rock","Paper","Scissors"};
        Scanner a = new Scanner (System.in);
        System.out.println ("Let's play rock paper scissors!");
        System.out.println ("Rock, Paper, or Scissors? (Caps sensative)");
        String things = a.nextLine();
        Random random = new Random(); // https://docs.oracle.com/javase/8/docs/api/java/util/Random.html
        int randomIdx = random.nextInt(object.length);
        System.out.println(object[randomIdx]);
        
    }
}



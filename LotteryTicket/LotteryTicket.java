import java.util.Arrays;
public class LotteryTicket
{
    // instance variables - replace the example below with your own
    private int[] containsSix = new int[6];
    private int bonusNumber; 
    public static int numTickets;

    public LotteryTicket()
    {
        int random = (int)(Math.random() * 69 + 1);
        for (int i = 0; i<containsSix.length; i++) {
            containsSix[i] = random;
        }
        int random2 = (int)(Math.random() * 26 + 1); 

    }

    public LotteryTicket(int[] n, int b) {

    }
    /*
    public int[] getNumbers() {

    }

    public String toString() {
    return ("Your lottery ticket number is " + Arrays.toString(containsSix) + " with a bonus number: " + bonusNumber);
    }

    public int getBonusNumber() {

    }
     */
}


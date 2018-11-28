import java.util.Arrays;

public class LotteryTicket {
    // instance variables - replace the example below with your own
    private int[] containsSix = new int[6];
    private int bonusNumber;
    public static int numTickets = 0;

    public LotteryTicket() {
        int random = (int) (Math.random() * 69 + 1);
        for (int i = 0; i < 6; i++) {
            for (int x = 0; x < i; x++) {
                if (containsSix[x] == random) {
                    random = (int) (Math.random() * 69 + 1);
                    x = -1; // restart loop
                }
            } 
            containsSix[i] = random;
        }

        bonusNumber = (int) (Math.random() * 26 + 1);
        numTickets++;
    }

    public LotteryTicket(int[] n, int b) {
        containsSix = n;
        bonusNumber = b;
        numTickets++;
    }

    public int[] getNumbers() {
        return containsSix;
    }

    public String toString() {
        return ("Ticket ID: " + numTickets + " with ticket number: "  + Arrays.toString(containsSix) + " with a bonus number: " + bonusNumber);
    }

    public int getBonusNumber() {
        return bonusNumber;
    }
}
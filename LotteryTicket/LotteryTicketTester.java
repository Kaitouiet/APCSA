import java.util.Arrays;

public class LotteryTicketTester{
    public static void main() {
        //Run this code and then call me over to show me the output.
        //You are NOT allowed to change anything in this program. 

        LotteryTicket tix = new LotteryTicket(new int[] {1,2,3,4,5,6},7);
        System.out.println (tix.toString());
        System.out.println (Arrays.toString(tix.getNumbers()));
        System.out.println (tix.getBonusNumber());
        LotteryTicket tix2 = new LotteryTicket(new int[] {2,3,4,5,6,7},8);
        System.out.println (tix2.toString());        
        LotteryTicket tix3 = new LotteryTicket(new int[] {3,4,5,6,7,8},9);
        System.out.println (tix3.toString());
        System.out.println ("\n\n\n");

        
        //----------------------------------------------------------------------
        


        LotteryTicket randomTix;
        for (int i=0;i<10;i++){
        randomTix = new LotteryTicket();
        System.out.println (randomTix.toString());
        }


        //----------------------------------------------------------------------
        
        /* Uncomment this section after you have created a LotteryDrawing class
         * Show to Mr. Billing once you run it
         * 
        LotteryTicket actualTix = new LotteryTicket();;
        LotteryDrawing drawing;

        for (int i=0;i<104;i++){
            drawing = new LotteryDrawing();
            System.out.println (actualTix);
            System.out.println (drawing);
            System.out.println ("matches = "+drawing.numOfFirstSetMatches(actualTix));
            System.out.println ("bonus match = "+drawing.doesBonusNumberMatch(actualTix));
            System.out.println ("\n-----------------------------------\n");
        }
        */
    }

}


public class LotteryDrawing
{
    LotteryTicket winningNumbers;

    /**
     * Constructor for objects of class LotteryDrawing
     */
    public LotteryDrawing()
    {
        winningNumbers = new LotteryTicket(); // initialise instance variables

    }

    /*
    public int numOfFirstSetMatches(LotteryTicket userTix)
    {
    return  // put your code here
    }
     */
    public boolean doesBonusNumberMatch(LotteryTicket userTix)
    {
        return userTix.getBonusNumber() == winningNumbers.getBonusNumber(); // put your code here
    }
    /*
    public String toString()
    {
    return  // put your code here
    }
     */
}

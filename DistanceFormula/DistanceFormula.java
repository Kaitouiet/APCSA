import java.util.Scanner;

public class DistanceFormula {
    public static void main (String[] arg) {
        Scanner a = new Scanner(System.in);
        System.out.println("");
        System.out.println("Hi there! This is a distance converter. Please notice that the numbers are mostly rounded up :) ");
        System.out.println("");
        System.out.print("Please enter x1: ");
        int x1 = a.nextInt();
        System.out.print("Please enter x2: ");
        int x2 = a.nextInt();
        System.out.print("Please enter y1: ");
        int y1 = a.nextInt();
        System.out.print("Please enter y2: ");
        int y2 = a.nextInt();
        System.out.println("The result is: " + (double)(Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2))));
        System.out.println("");
        System.out.println ("Wonderful.");
    }
}

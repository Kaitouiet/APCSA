import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Hi there! This is a temp converter. Please notice that the numbers are mostly rounded up :) ");
        System.out.println("");
        System.out.println("Convert in Celcius or Fahrenheit?");
        char t = a.next().charAt(0);
        if (t == 'F'|| t == 'f') {            
            System.out.print("Enter the temperature in Fahrenheit to convert: ");
            int fDegree = a.nextInt();
            System.out.println("The temperature in Celcius is " + (double)((fDegree-32)/1.8) + "°C");

        }
        else if (t == 'C' || t == 'c') {
            System.out.print("Enter the temperature in Celcius to convert: ");
            int cDegree = a.nextInt();
            System.out.println("The temperature in Fahrenheit is " + (double)(cDegree*1.8 + 32) + "°F");

        }
    }
}
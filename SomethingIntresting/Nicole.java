import java.util.Scanner;
public class Nicole {
    public static void main(String[] args){
        double[] randomNumbers = {1.1, 1.3, 11.1, 123.45, 84.45, 1235,7};
        double nicole = 5.01;
        double kiet = 4.99; 

        System.out.println("What is nicole + kiet?");
        Scanner k = new Scanner(System.in);
        double py = k.nextDouble();
        System.out.println("You are just wrong.");
        System.out.println("The right answer is actually " + (nicole + kiet) + "!");
        System.out.println("Wonderful... :)");
        System.out.println("Let's just print some random numbers you know?"); 
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.println(randomNumbers[i] + " ");
        }
    }
}

        
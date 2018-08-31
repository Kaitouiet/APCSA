import java.util.Scanner;

public class HelloName {
    public static void main() {
        System.out.printf ("What is your name");
        Scanner s = new Scanner(System.in);
        System.out.println ("Hello" + s.nextLine());
    }
}

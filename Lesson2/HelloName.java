import java.util.Scanner;

public class HelloName {
    public static void main() {
        System.out.println ("What is your name");
        Scanner s = new Scanner(System.in);
        System.out.println ("Hello" + s.nextLine());
    }
}

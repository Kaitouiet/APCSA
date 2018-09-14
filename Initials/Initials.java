import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        
        System.out.print("First name: ");
        String first = name.next(); 

        System.out.print("Middle name: ");
        String middle = name.next();

        System.out.print("Last name: ");
        String last = name.next();

        // Display the initials.
        System.out.println("Initials is "
            + first.charAt(0)  // we usse charAt to get first character
            + middle.charAt(0)
            + last.charAt(0));
    }
}
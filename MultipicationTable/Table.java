import java.util.Scanner;

// this is just like our bonus homework we got, where we have a for loop inside a for loop 
public class Table {
   public static void main() {
    for (int x = 1; x <= 12; ++x) {
        for (int y = 1; y <= 12; ++y) {
            System.out.printf("%4d", (x*y)); //%4d fixes formatting issues by allocating 4 characters, in simple terms 4 spaces
        }
        System.out.println();
    }
}
}

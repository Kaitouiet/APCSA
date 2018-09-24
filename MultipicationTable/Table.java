import java.util.Scanner;

public class Table {
   public static void main() {
    for (int x = 1; x <= 12; ++x) {
        for (int y = 1; y <= 12; ++y) {
            System.out.printf("%4d", (x*y)); //%4d fixes formatting issues
        }
        System.out.println();
    }
}
}
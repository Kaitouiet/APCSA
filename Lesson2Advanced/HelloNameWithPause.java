import java.util.Scanner;

public class HelloNameWithPause {
    public static void main() {
        System.out.println ("What is your name");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        
           try {
            Thread.sleep (500);
            System.out.print(".");
            Thread.sleep (500);
            System.out.print(".");
            Thread.sleep (500);
            System.out.print(".");
            Thread.sleep (500);            
            System.out.println ("Hello " + name);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

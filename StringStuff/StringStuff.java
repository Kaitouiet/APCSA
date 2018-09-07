/* Most important String methods
 * 
 * int length()
 * String substring(int from)
 * String substring(int from, int to)
 * int indexOf()
 * 
 * Remember - methods are called by using the 'dot' operator
 */
import java.util.Scanner;
public class StringStuff{
    public static void main(){
        //Here's an example of each of these methods
        String str = "ABCDEFGHIJ";
        System.out.println ("The message is:  "+str);
        System.out.println ("Length of message is:  "+str.length());
        System.out.println ("Message without first character is:  "+str.substring(1));
        System.out.println ("Message from 3rd to 7th character is:  "+str.substring(2,7));
        System.out.println ("The first occurence of the letter F is at index:  "+str.indexOf("F"));

        //Now - let’s have the user enter information and do the same things.
        //Ask the user to enter a message
        System.out.println ("Hi there :) Enter any text you want here");
        //Create a variable and store the users input into that variable
        Scanner t = new Scanner(System.in);
        System.out.println (t.nextLine());
        String a = t.nextLine();
        //Tell the user how long their message was
        System.out.println ("Length of message is:  "+a.length());
        //Ask the user how many characters they want to remove from the front of the message
        System.out.println ("How many characters do you want to remove from the front of your text? :)");
        //Create a variable and store the users input into that variable
        int zZ = t.nextInt();
        //Tell the user what the new message is
        //For example, if they enter 4, your program should say: 
        //"The message without the first 4 characters is " and then the shortened message
        System.out.println ("Your message without first " +zZ+  "character is: " + a.substring(zZ));
        //Ask the user how many characters they want to remove from the back of the message
        System.out.println ("HEY! Now it's time for you to do more stuff. Now how many characters do you want to remove from the back of your text?");
        //Create a variable and store the users input into that variable
        int love = t.nextInt();
        //Tell the user what the new message is, with characters removed from both the front and the back.
        //fyi - this last one is a little more challenging
        
        //Ask the user to enter a letter that occurs in the message

        //Create a variable and store the users input into that variable

        //Tell the user when that character first appears in the message

        //Finished with more time?
        //https://docs.oracle.com/javase/8/docs/api/java/lang/String.html
        //Ctrl-F "replace" and check out the fun replace methods
        //Play with them
    }
}


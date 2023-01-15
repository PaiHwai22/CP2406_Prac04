import java.util.Scanner;
/*This class prompts user to enter an integer and determines if the number is odd or even. */
public class EvenOdd {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // Create scanner object
        System.out.println("Enter an integer");

        Integer userInt = myObj.nextInt(); // Read user's integer
        if (userInt % 2 == 0) {
            System.out.println("The integer " + userInt+ " is even.");
        } else {
            System.out.println("The integer " + userInt+ " is odd.");
        }

    }
}

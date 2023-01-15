/*This class prompts user for an even integer number until user enters sentinel assignment. */

import java.util.Scanner;
public class EvenEntryLoop {
    public static void main(String[] args) {

        int sentinel = 999;
        Scanner sc = new Scanner(System.in);
        System.out.println("Type an even number or 999: ");
        int input = sc.nextInt();
        while (input != sentinel) {
            // System.out.println("Type an even number or 999: ");
            if ((input % 2) == 0) { // is even
                System.out.println("Good Job!");
                System.out.println("Type an even number or 999: ");
                input = sc.nextInt();

            } else if ((input % 2) != 0) {
                System.out.println("Error: entry is odd");
                System.out.println("Type an even number or 999: ");
                input = sc.nextInt();

            }
        }

    }
}














import java.util.Collections;
import java.util.Scanner;
import java.util.*;
/* This class gets user to input 3 integers and prints them in ascending and descending order. */

public class AscendingAndDescending{
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first integer:  ");
        int a= sc.nextInt();
        System.out.print("Enter second integer:  ");
        int b= sc.nextInt();
        System.out.print("Enter third integer:  ");
        int c= sc.nextInt();

        List< Integer > list = new ArrayList<>(List.of(a, b, c));

        Collections.sort(list);
        System.out.print("\nAscending order: \n" + list);
        list.sort(Collections.reverseOrder());
        System.out.println("\nDescending order: " + list);

    }

}
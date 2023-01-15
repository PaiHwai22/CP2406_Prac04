import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.*;

import static java.util.Collections.*;

public class AscendingAndDescending{
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter first integer:  ");
        int a= sc.nextInt();
        System.out.print("Enter second integer:  ");
        int b= sc.nextInt();
        System.out.print("Enter third integer:  ");
        int c= sc.nextInt();

        List< Integer > list = new ArrayList<>(List.of(a, b, c));

        Collections.sort(list);
        System.out.print("\nAscending order: " + list);

        System.out.println("\nDescending order: ");
        list.sort(Collections.reverseOrder());
        System.out.println( list );

    }

}
package exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise2 {

    public static int[] getUserInput() {
        int[] integers = new int[2];
        Scanner intInput = new Scanner(System.in);


       while (true) {
        try {
            System.out.println("Enter divisor:");
            integers[0] = intInput.nextInt();
            System.out.println("Enter dividend:");
            integers[1] = intInput.nextInt();
        }
        catch (InputMismatchException e) {
            System.err.println("Invalid input. Please try again.");
            getUserInput();

        }
        return integers;

       }


    }

}
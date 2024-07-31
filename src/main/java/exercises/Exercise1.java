package exercises;

public class Exercise1 {

    public static int divide(int numerator, int denominator) {
        int division = 0;
        try {
            division = numerator / denominator;
        } catch (ArithmeticException e ){
           throw e;
        }
        return division;
    }

}

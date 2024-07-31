package exercises;

public class Exercise3 {

    public static void divide() {

        int[] inputs;

        while (true) {
            inputs = Exercise2.getUserInput();
            int result = 0;

            try {
               result = Exercise1.divide(inputs[0], inputs[1]);
            } catch (ArithmeticException e){
                System.err.println("Cannot divide by zero. Please try again.");
                divide();

            }
            System.out.println(result);
            break;
        }

    }

}

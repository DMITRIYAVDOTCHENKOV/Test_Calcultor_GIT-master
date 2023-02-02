package calculated;

import java.util.InputMismatchException;

public class Calculated {
    public static int calculated (int num1, int num2, char op) {
        int result = 0;
        switch (op) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                try {
                    result = num1 / num2;
                } catch (ArithmeticException | InputMismatchException e) {
                    System.out.println("Exception : " + e);
                    System.out.println("Only integer non-zero parameters allowed");

                }
            }
            default -> throw new IllegalArgumentException("Не верный знак операции");
        }
        return result;
    }
}

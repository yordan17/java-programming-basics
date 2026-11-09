package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String operation = scanner.nextLine();

        int result = 0;

        if (operation.equals("+")) {
            result = n1 + n2;
        } else if (operation.equals("-")) {
            result = n1 - n2;
        } else if (operation.equals("*")) {
            result = n1 * n2;
        }

        if (operation.equals("+") ||
                operation.equals("-") ||
                operation.equals("*")) {

            if (result % 2 == 0) {
                System.out.printf("%d %s %d = %d - even",
                        n1, operation, n2, result);
            } else {
                System.out.printf("%d %s %d = %d - odd",
                        n1, operation, n2, result);
            }

        } else if (operation.equals("/")) {

            if (n2 == 0) {
                System.out.printf("Cannot divide %d by zero", n1);
            } else {
                double divisionResult = (double) n1 / n2;

                System.out.printf("%d / %d = %.2f",
                        n1, n2, divisionResult);
            }

        } else if (operation.equals("%")) {

            if (n2 == 0) {
                System.out.printf("Cannot divide %d by zero", n1);
            } else {
                int remainder = n1 % n2;

                System.out.printf("%d %% %d = %d",
                        n1, n2, remainder);
            }
        }
    }
}

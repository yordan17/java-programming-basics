package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double price = -1;

        switch (dayOfWeek) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> {
                price = switch (fruit) {
                    case "banana" -> 2.50 * quantity;
                    case "apple" -> 1.20 * quantity;
                    case "orange" -> 0.85 * quantity;
                    case "grapefruit" -> 1.45 * quantity;
                    case "kiwi" -> 2.70 * quantity;
                    case "pineapple" -> 5.50 * quantity;
                    case "grapes" -> 3.85 * quantity;
                    default -> price;
                };
            }
            case "Saturday", "Sunday" -> {
                price = switch (fruit) {
                    case "banana" -> 2.70 * quantity;
                    case "apple" -> 1.25 * quantity;
                    case "orange" -> 0.90 * quantity;
                    case "grapefruit" -> 1.60 * quantity;
                    case "kiwi" -> 3.00 * quantity;
                    case "pineapple" -> 5.60 * quantity;
                    case "grapes" -> 4.20 * quantity;
                    default -> price;
                };
            }
        }

        if (price == -1) {
            System.out.println("error");
        } else {
            System.out.printf("%.2f", price);
        }
    }
}

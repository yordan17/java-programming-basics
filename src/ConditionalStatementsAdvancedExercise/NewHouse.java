package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowerType = scanner.nextLine();
        int flowerCount = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        double price = 0;

        if (flowerType.equals("Roses")) {
            price = 5;
        } else if (flowerType.equals("Dahlias")) {
            price = 3.80;
        } else if (flowerType.equals("Tulips")) {
            price = 2.80;
        } else if (flowerType.equals("Narcissus")) {
            price = 3;
        } else if (flowerType.equals("Gladiolus")) {
            price = 2.50;
        }

        double totalPrice = getTotalPrice(price, flowerCount, flowerType);

        if (totalPrice <= budget) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerCount, flowerType, budget - totalPrice);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", totalPrice - budget);
        }
    }

    private static double getTotalPrice(double price, int flowerCount, String flowerType) {
        double totalPrice = price * flowerCount;

        if (flowerType.equals("Roses") && flowerCount > 80) {
            totalPrice *= 0.9;
        } else if (flowerType.equals("Dahlias") && flowerCount > 90) {
            totalPrice *= 0.85;
        } else if (flowerType.equals("Tulips") && flowerCount > 80) {
            totalPrice *= 0.85;
        } else if (flowerType.equals("Narcissus") && flowerCount < 120) {
            totalPrice *= 1.15;
        } else if (flowerType.equals("Gladiolus") && flowerCount < 80) {
            totalPrice *= 1.20;
        }
        return totalPrice;
    }
}

package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double groupBudget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermenCount = Integer.parseInt(scanner.nextLine());

        double boatPrice = getBoatPrice(season, fishermenCount);

        if (groupBudget >= boatPrice) {
            System.out.printf("Yes! You have %.2f leva left.", groupBudget - boatPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", boatPrice - groupBudget);
        }

    }

    private static double getBoatPrice(String season, int fishermenCount) {
        double boatPrice = 0;

        switch (season) {
            case "Spring" -> boatPrice = 3000;
            case "Summer", "Autumn" -> boatPrice = 4200;
            case "Winter" -> boatPrice = 2600;
        }

        if (fishermenCount <= 6) {
            boatPrice *= 0.9;
        } else if (fishermenCount <= 11) {
            boatPrice *= 0.85;
        } else {
            boatPrice *= 0.75;
        }

        if (fishermenCount % 2 == 0 && !season.equals("Autumn")) {
            boatPrice *= 0.95;
        }
        return boatPrice;
    }
}

package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int degrees = Integer.parseInt(scanner.nextLine());
        String timeOfDay = scanner.nextLine();

        String outfit = "";
        String shoes = "";

        if (degrees >= 10 && degrees <= 18) {
            switch (timeOfDay) {
                case "Morning" -> {
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";
                }
                case "Afternoon", "Evening" -> {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                }
            }
        } else if (degrees > 18 && degrees <= 24) {
            switch (timeOfDay) {
                case "Morning", "Evening" -> {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                }
                case "Afternoon" -> {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                }
            }
        } else {
            switch (timeOfDay) {
                case "Morning" -> {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                }
                case "Afternoon" -> {
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                }
                case "Evening" -> {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                }
            }
        }
        System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
    }
}

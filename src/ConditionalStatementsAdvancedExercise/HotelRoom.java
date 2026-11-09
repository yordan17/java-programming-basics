package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double studioPrice = 0;
        double apartmentPrice = 0;

        switch (month) {
            case "May", "October" -> {
                studioPrice = 50;
                apartmentPrice = 65;
            }
            case "June", "September" -> {
                studioPrice = 75.20;
                apartmentPrice = 68.70;
            }
            case "July", "August" -> {
                studioPrice = 76;
                apartmentPrice = 77;
            }
        }

        double totalStudioPrice = studioPrice * nights;
        double totalApartmentPrice = apartmentPrice * nights;

        if (nights > 14) {
            totalApartmentPrice *= 0.90;
        }

        if (month.equals("May") || month.equals("October")) {
            if (nights > 14) {
                totalStudioPrice *= 0.70;
            } else if (nights > 7) {
                totalStudioPrice *= 0.95;
            }
        } else if (month.equals("June") || month.equals("September")) {
            if (nights > 14) {
                totalStudioPrice *= 0.80;
            }
        }

        System.out.printf("Apartment: %.2f lv.%n", totalApartmentPrice);
        System.out.printf("Studio: %.2f lv.", totalStudioPrice);
    }
}

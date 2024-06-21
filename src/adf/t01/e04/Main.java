package adf.t01.e04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Menu:");
            System.out.println("1. List available rooms");
            System.out.println("2. List occupied rooms");
            System.out.println("3. Check-in");
            System.out.println("4. Check-out");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Available rooms:");
                    hotel.listarHabitaciones(false);
                    break;
                case 2:
                    System.out.println("Occupied rooms:");
                    hotel.listarHabitaciones(true);
                    break;
                case 3:
                    System.out.print("Enter the room number for check-in: ");
                    int checkInNumber = scanner.nextInt();
                    if (hotel.checkIn(checkInNumber)) {
                        System.out.println("Check-in successful.");
                    } else {
                        System.out.println("Check-in failed. Please verify the room number.");
                    }
                    break;
                case 4:
                    System.out.print("Enter the room number for check-out: ");
                    int checkOutNumber = scanner.nextInt();
                    double charge = hotel.checkOut(checkOutNumber);
                    if (charge != -1) {
                        System.out.println("Check-out successful. Amount to pay: " + charge + " euros.");
                    } else {
                        System.out.println("Check-out failed. Please verify the room number.");
                    }
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}

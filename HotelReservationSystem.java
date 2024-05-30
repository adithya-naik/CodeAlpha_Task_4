import java.util.Scanner;

class HotelReservationSystem {
    private static boolean[] rooms = new boolean[10]; // Assuming 10 rooms in the hotel
    private static String[] roomCategories = {"Standard", "Deluxe", "Suite"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nHotel Reservation System");
            System.out.println("1. Book a room");
            System.out.println("2. View room availability");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    bookRoom();
                    break;
                case 2:
                    viewAvailability();
                    break;
                case 3:
                    System.out.println("Thank you for using our system!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }


    private static void bookRoom() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter room number (1-10): ");
        int roomNumber = scanner.nextInt();

        if (roomNumber < 1 || roomNumber > 10) {
            System.out.println("Invalid room number. Please choose between 1 and 10.");
            return;
        }

        if (rooms[roomNumber - 1]) {
            System.out.println("Room " + roomNumber + " is already booked.");
        } else {
            rooms[roomNumber - 1] = true;
            System.out.println("Room " + roomNumber + " booked successfully!");

            // Ask for room category
            System.out.println("Select room category:");
            for (int i = 0; i < roomCategories.length; i++) {
                System.out.println((i + 1) + ". " + roomCategories[i]);
            }
            System.out.print("Enter your choice (1-" + roomCategories.length + "): ");
            int categoryChoice = scanner.nextInt();

            if (categoryChoice >= 1 && categoryChoice <= roomCategories.length) {
                System.out.println("You've selected " + roomCategories[categoryChoice - 1] + " category.");

                // Ask for payment type
                System.out.println("Select payment type:");
                System.out.println("1. Cash");
                System.out.println("2. Credit Card");
                System.out.print("Enter payment type (1 or 2): ");
                int paymentType = scanner.nextInt();

                if (paymentType == 1) {
                    System.out.println("Payment received in cash. Enjoy your stay!");
                } else if (paymentType == 2) {
                    System.out.println("Payment received via credit card. Enjoy your stay!");
                } else {
                    System.out.println("Invalid payment type. Please choose 1 or 2.");
                }
            } else {
                System.out.println("Invalid category choice. Please try again.");
            }
        }
    }

    private static void viewAvailability() {
        System.out.println("\nRoom Availability:");
        for (int i = 0; i < rooms.length; i++) {
            System.out.println("Room " + (i + 1) + ": " + (rooms[i] ? "Booked" : "Available"));
        }

    }
    
}


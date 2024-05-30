# Hotel Reservation System

This is a simple hotel reservation system implemented in Java. It allows users to book rooms, view room availability, and select payment methods.

## Features

1. **Book a Room**
   - Users can choose a room number (from 1 to 10).
   - If the room is available, it will be booked.
   - Users can also select the room category (standard, deluxe, or suite).

2. **View Room Availability**
   - The system displays the availability status of each room.

3. **Payment Types**
   - After booking a room, users can choose between two payment types:
     - **Cash**: Payment received in cash.
     - **Credit Card**: Payment received via credit card.

## How to Use

1. Compile the Java code:
   ```bash
   javac HotelReservationSystem.java
   ```

2. Run the program:
   ```bash
   java HotelReservationSystem
   ```

3. Follow the on-screen instructions to book rooms and make payments.

## Example Usage

```
Hotel Reservation System
1. Book a room
2. View room availability
3. Exit
Enter your choice: 1

Enter room number (1-10): 5
You've selected Deluxe category.
Select payment type:
1. Cash
2. Credit Card
Enter payment type (1 or 2): 2
Payment received via credit card. Enjoy your stay!

...

Room Availability:
Room 1: Available
Room 2: Booked
...
```

package busReservation;

import java.util.ArrayList;
import java.util.Scanner;

public class BusDemo {

    public static void main(String[] args) {
        int bookingNo = 0;

        ArrayList<Bus> buses = new ArrayList<>();
        ArrayList<Booking> bookings = new ArrayList<>();

        System.out.println("Bus Details");
        buses.add(new Bus(1, true, 1, "Raj", "Chennai", "Coimbatore" ));
        buses.add(new Bus(2, false, 65, "Ram", "Coimbatore", "Tanjore"));
        buses.add(new Bus(3, true, 55, "Rahu", "Tanjore", "Chennai"));

        Scanner sc = new Scanner(System.in);
        int userOption = 1;

        for(Bus b: buses){
            b.displayBusInfo();
        }

        while(userOption == 1) {
            System.out.println("Enter 1 to Book and 2 to Exit");
            userOption = sc.nextInt();
            if(userOption == 1){
                Booking booking = new Booking();

                Bus bus = null;
                for (Bus b : buses) {
                    if (b.getBusNo() == booking.busNo) {
                        bus = b;
                        break;
                    }
                }

                if(bus!= null && booking.isAvailable(bookings, buses)){
                    bookings.add(booking);
                    bookingNo++;
                    System.out.println("Your Booking is Confirmed!!");
                    System.out.println("\nHere are your Booking details: ");
                    System.out.println("Your Booking ID is " + bookingNo);
                    System.out.println("Contact Driver: " + bus.getDriverName());
                    System.out.println("Date: " + booking.date);
                    System.out.println("Have a happy journey.... " + bus.getSource() + "-->" + bus.getDestination());
                    System.out.println();
                }
                else{
                    System.out.println("Sorry, Bus is full. Try another Bus or in another Date....");
                    System.out.println();
                }
            }
        }
        sc.close();
    }
}

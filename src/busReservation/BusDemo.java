package busReservation;

import java.util.ArrayList;
import java.util.Scanner;

public class BusDemo {
    public static void main(String[] args) {

        ArrayList<Bus> buses = new ArrayList<>();
        ArrayList<Booking> bookings = new ArrayList<>();

        System.out.println("Bus Details");
        buses.add(new Bus(1, true, 1));
        buses.add(new Bus(2, false, 65));
        buses.add(new Bus(3, true, 55));

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
                if(booking.isAvailable(bookings, buses)){
                    bookings.add(booking);
                    System.out.println("Your Booking is Confirmed!!");
                }
                else{
                    System.out.println("Sorry, Bus is full. Try another Bus or in another Date....");
                }
            }
        }
        sc.close();
    }
}

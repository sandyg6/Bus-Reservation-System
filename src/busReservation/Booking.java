package busReservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Booking {
    String passengerName;
    int busNo;
    Date date;

    Booking(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name of Passenger: ");
        this.passengerName = sc.next();
        System.out.print("Enter Bus No.: ");
        this.busNo = sc.nextInt();
        System.out.print("Enter data dd-mm-yyyy: ");
        String dateInput = sc.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            this.date = dateFormat.parse(dateInput);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses){
        int capacity = 0;
        for(Bus bus: buses){
            if(bus.getBusNo() == busNo) { //busNo -> Directly used of booking
                capacity = bus.getCapacity();
            }
        }
        int booked = 0;
        for(Booking b: bookings){
            if(b.busNo == busNo && b.date.equals(date)){
                booked++;
            }
        }
        return booked < capacity;
    }
}

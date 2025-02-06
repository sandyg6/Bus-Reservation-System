package busReservation;

public class Bus {
    private int busNo;
    private boolean ac;
    private int capacity;

    Bus(int busNo, boolean ac, int capacity){
        this.busNo = busNo;
        this.ac = ac;
        this.capacity = capacity;
    }
    //accessor methods - get and set
    //set method - mutator

    public int getBusNo() {
        return busNo;
    }

    public void setAc(boolean ac) {
        this.ac = ac;
    }

    public boolean isAc() {
        return ac;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void displayBusInfo(){
        System.out.println("Bus No: " + busNo + " || AC: " + ac + " || Total Capacity: " + capacity);
    }
}

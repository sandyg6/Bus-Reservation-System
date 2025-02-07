package busReservation;

public class Bus {
    private int busNo;
    private boolean ac;
    private int capacity;
    private String driverName;
    private String Source;
    private String Destination;

    Bus(int busNo, boolean ac, int capacity, String driverName, String Source, String Destination){
        this.busNo = busNo;
        this.ac = ac;
        this.capacity = capacity;
        this.driverName = driverName;
        this.Source = Source;
        this.Destination = Destination;
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

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getSource() {
        return Source;
    }

    public void setSource(String source) {
        Source = source;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }

    public void displayBusInfo(){
        System.out.println("Bus No: " + busNo + " || AC: " + ac + " || Total Capacity: " + capacity);
    }
}

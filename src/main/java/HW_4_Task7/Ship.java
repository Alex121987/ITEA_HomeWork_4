package HW_4_Task7;

public class Ship extends Vehicle {
    int passengers;
    String seaPort;

    public Ship(double price, int speed, int year, int passengers, String seaPort) {
        super(price, speed, year);
        this.passengers = passengers;
        this.seaPort = seaPort;
    }

    @Override
    public String toString() {
        return "Ship: " +
                "passengers=" + passengers +
                ", seaPort='" + seaPort + '\'' +
                ", price=" + price +
                ", speed=" + speed +
                ", year=" + year;
    }
}

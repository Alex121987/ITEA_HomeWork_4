package HW_4_Task3;

public class Car {
    private int year;
    private String color;

    public Car() {
        this.year = 2002;
        this.color = "Green";
    }

    public Car(int year) {
        this.year = year;
    }

    public Car(String color) {
        this.color = color;
    }

    public Car(int year, String color) {
        this.year = year;
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (year == 0)
            return " " + color;
        if (color.isEmpty())
            return " " + year;
        return " " + year + " " + color;
    }
}

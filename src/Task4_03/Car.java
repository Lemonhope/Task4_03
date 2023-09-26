package Task4_03;

public class Car {
    private int year;
    private String color;

    public Car() {
        year = 1990;
        color = "white";
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

    @Override
    public String toString() {
        return "\nCar:\n" +
                "year=" + year +
                ", \ncolor='" + color + '\'';
    }
}

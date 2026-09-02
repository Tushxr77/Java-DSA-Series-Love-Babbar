package OOPS;

public class PassingClassMethods {

    public static class Car {
        int seats;
        String name;
        double length;
        String type;

        void print() {
            System.out.println(seats + " " + name + " " + length + " " + type);
        }
    }

    public static void main(String[] args) {

        Car c = new Car();

        c.seats = 4;
        c.name = "BMW";
        c.length = 85;
        c.type = "SUV";

        // Just To Check The Attributes
        // System.out.println(c.seats);

        // change(c);
        // System.out.println(c.seats);

        c.print();
    }

    public static void change(Car c) {
        c.seats = 6;
    }
}

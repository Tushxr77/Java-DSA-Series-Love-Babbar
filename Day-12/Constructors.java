package OOPS;

public class constructors {
    public static class Car {
        int Seats;
        String name;
        double length;
        String type;
            //Method over loading --> whene ther is 2,3 method of the same name with the diff parameter
        Car(){//Default ctor
            // --> only apply when there is no other parametrized ctor
            //it will only work whene there is no parametrized ctor

        }
        Car(int x,String s,double d,String t){
            Seats = x;
            name = s;
            length = d;
            type  = t;
        }
            void print(){
                System.out.println(Seats+" "+name+" "+length+" "+type);
            }


     }
    public static void main(String[] args){
        Car c1 = new Car(4,"BMW",4.5,"Suv");
        c1.print();
        Car c2 = new Car(8,"Force",8.5,"Passenger");
        c2.print();

    }
}

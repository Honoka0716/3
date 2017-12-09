import java.util.*;

public class Partice {
    public static void main(String[] arg) {
        List<Vehicle> ls = new ArrayList<>();
        ls.add(new Car(1, "NJ66666", "red"));
        ls.add(new Bus(3, "NB74110", 25));
        ls.add(new Truck(5, "NJ66666", 5));
        for(int i = 0; i < ls.size(); i++) {
            Vehicle v = ls.get(i);
            v.getTime();
            v.payToll();
            System.out.println(v);
            System.out.println(v.print());
            System.out.println(v.payToll());
            System.out.println(v.getTime());
        }
    }
}
class Car extends Vehicle {
    private String color;
    public Car(int h, String m, String c) {
        super(h, m);
        color = c;
       
    }
    public double payToll() {
        return 15 * super.getTime();
    }
    public String toString() {
        return "i am a car.";
    }
   public String print() {
        return "i am a car.";
    }
}



class Bus extends Vehicle {
    private int seat;
    public Bus (int h, String m,int n ) {
        super(h, m);
        seat = n;

    }
    //

    public double payToll() {
        return 25 * super.getTime();
    }
    public String toString() {
        return "i am a bus.";
    }
   public String print() {
        return "i am a car.";
    }

}

class Truck extends Vehicle {
    private int seat;
    public Truck (int h, String m,int n ) {
        super(h, m);
        seat = n;

    }
    public double payToll() {
        return 25 * super.getTime();
    }
    public String toString() {
        return "i am a truck.";
    }
    public String print() {
        return "i am a car.";
    }

}
//Assume you will build a parking lot, there are three types vehicles, Bus, Car, Truck.
//we charge 15 cents for a car, 25 cents for a bus, 50 cents for a truck
//we need to know how long these vehicles will park
//and for a car we need to know its color, how many seats for a bus, how many weights a truck can load
//and you should output the type of these vehicles because I will use a pointer to store them.
//example: a car should output "I am a car"
//finish the code, you can add method in the below code.
interface IVehicle {
    public double payToll(); // this should return the money you should pay
    public double getTime(); // this should return the time you park
}

abstract class Vehicle implements IVehicle {
    private int time;
    private String number;
    public Vehicle(int h, String n) {
        time = h;
        number = n;
    }
    public double getTime() {
        return time;
    }
    //public abstract String toString();//toString method 鍙互琚敞閲婄敱浜巘oString涓烘瘡涓被榛樿瀛樺湪
    public abstract String print();//濡傛灉浣跨敤vehicle.print锛堬級鍒欏繀椤绘樉鎬у０鏄�
} 
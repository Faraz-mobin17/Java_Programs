package Foundation.OOPS.Polymorphism;
/*
 * NOTE: we cannot make object of abstract class because it does not has body and
 * implementation
 * abstract class must contain abstract method
 */
public class Polymorphism {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();
        FighterPlane fp = new FighterPlane();
        Airport a = new Airport();
        a.poly(fp);
        a.poly(pp);
        a.poly(cp);

        AeroPlane ref1 = new PassengerPlane();
        AeroPlane ref2 = new CargoPlane();
        ref1.takeOff();
        ref1.fly();

        ref2.takeOff();
        ref2.fly();
        // ref2.alert(); // cannot access specialized method using AeroPlane ref you need to make child class obj.
        // example
        // CargoPlane cp  = new CargoPlane();
        // cp.alert();
        // ((CargoPlane) ref2).alert(); // down casting
    }
}

abstract class AeroPlane {
    final int age = 10; // abstract class can contain final var
    int a = 10; // abstract class can contain non final var
    static final int roll = 91; // can contain static final var
    /*
     * No child class is implementing the functionality of parent class so it should 
     * be declared as abstract
     */
    // public void takeOff() {
    //     System.out.println("taking off");
    // }
    // public void fly() { // overidden method
    //     System.out.println("flying");
    // }
    abstract public void takeOff();
    abstract public void fly();
    public void landing() { // impure abstraction to acheive pure abstraction use interface
        System.out.println("Aeroplane is landing");
    }
}

class CargoPlane extends AeroPlane {
    public void takeOff() {
        System.out.println("Cargo plane is taking off");
    }
    public void fly() { // overidding method
        System.out.println("Cargo Plane is flying");
    }
    public void carryGoods() { // specialize methods
        System.out.println("cargo plane is carrying goods");
    }
    public void alert() {
        System.out.println("ALERT");
    }
}

class PassengerPlane extends AeroPlane {
    public void takeOff() {
        System.out.println("Passenger plane is taking off");
    }
    public void fly() { // overidding method 
        System.out.println("Passenger Plane is flying");
    }
    public void carryPassengers() // specialized methods
    {
        System.out.println("Passenger Plane carries passengers");
    }
}

class FighterPlane extends AeroPlane {
    public void takeOff() {
        System.out.println("fighter plane require small size runway");
    }
    public void fly() {
        System.out.println("fighter plane flies at hight height");
    }
}

class Airport {
    public void poly(AeroPlane ref) { // aceiving polymorphism
        ref.takeOff();
        ref.fly();
        System.out.println("===============================================");
    }
}
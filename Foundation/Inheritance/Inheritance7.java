package Foundation.Inheritance;

public class Inheritance7 {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();   
        cp.fly();
        pp.fly();
    }
}


class AeroPlane {
    public void takeOff() {
        System.out.println("taking off");
    }
    public void fly() { // overidden method
        System.out.println("flying");
    }
}

class CargoPlane extends AeroPlane {
    public void fly() { // overidding method
        System.out.println("Cargo Plane is flying");
    }
    public void carryGoods() { // specialize methods
        System.out.println("cargo plane is carrying goods");
    }
}

class PassengerPlane extends AeroPlane {
    public void fly() { // overidding method 
        System.out.println("Passenger Plane is flying");
    }
    public void carryPassengers() // specialized methods
    {
        System.out.println("Passenger Plane carries passengers");
    }
}
package CyleProgram;
 class Main {
    public static void main(String[] args) {
        NewCycle obj = new NewCycle(0, 0,3);
        System.out.println();
        obj.accelarate(20);
        obj.Break(10);
        obj.display();
        obj.displayHeight();
    }
}

class Cycle {
    int gear;
    int speed;
    // if we remove this Cycle constructor then we can't use super in the child class
    Cycle (int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }
    void Break(int dec) {
        this.speed = this.speed - dec;
    }
    void accelarate(int inc) {
        this.speed = this.speed + inc;
    }
    void display() {
        System.out.println("speed: " + speed + " " + " gear: " + gear);
    }
}
class NewCycle extends Cycle {
    int height;
    NewCycle(int gear, int speed, int setHeight) {
        super(gear, speed);
        this.height = setHeight;
    }
    void displayHeight() {
        System.out.println("Height: " + height);
    }
}

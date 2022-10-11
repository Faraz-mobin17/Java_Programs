package MyCycleProgram;

 class Main {
    public static void main(String[] args) {
        System.out.println("hi");
        // NewCycle myObj = new NewCycle(5);
        // myObj.display();
        // myObj.accelarate(50);
        // myObj.apply_break(10);
        // myObj.adjust_height_seat();
        // myObj.display();
        NewCycle myObj2 = new NewCycle(5,10,5);
        myObj2.display();
        myObj2.accelarate(50);
        myObj2.apply_break(10);
        myObj2.adjust_height_seat();
        myObj2.display();
    }
}

class Cycle {
    int gear;
    int speed;
    Cycle() {
        this.speed = 10;
        this.gear = 5;
    }
    Cycle(int gear,int speed) {
        this.speed = speed;
        this.gear = gear;
    }
    void apply_break(int x) {
        this.speed = this.speed - x;
        if (this.speed >= 80) {
            this.gear = 5;
        } else if (this.speed >= 50) {
            this.gear = 4;
        } else if (this.speed >= 40) {
            this.gear = 3;
        } else if (this.speed >= 30) {
            this.gear = 2;
        } else {
            this.gear = 1;
        }
    }
    void accelarate(int x) {
        this.speed = this.speed + x;
        if (this.speed >= 30) {
            this.gear = 2;
        } else if (this.speed >= 40) {
            this.gear = 3;
        } else if (this.speed >= 50) {
            this.gear = 4;
        } else {
            this.gear = 5;
        }
    }
    void display() {
        System.out.println("Speed: " + this.speed);
        System.out.println("Gear: " + this.gear);
    }
}

class NewCycle extends Cycle {
    int setHeight;
    // NewCycle(int h) {
    //     this.setHeight = h;
    // }
    NewCycle(int gear, int speed,int h) {
        super(gear,speed);
        this.setHeight = h;
    }
//    void adjust_height_seat() {
//      if (this.setHeight >= 5) {
//         super.speed = super.speed - 10;
//         super.gear = super.gear - 1;
//      } else if (this.setHeight > 8) {
//         super.speed = super.speed - 20;
//         super.gear = super.gear - 1;
//      } else {
//         super.speed = super.speed - 30;
//         super.gear = super.gear - 1;
//      }
//    }
void adjust_height_seat() {
    if (this.setHeight >= 5) {
       this.speed = speed - 10;
       this.gear = gear - 1;
    } else if (this.setHeight > 8) {
       this.speed = speed - 20;
       this.gear = gear - 1;
    } else {
       this.speed = speed - 30;
      this.gear = gear - 1;
    }
  }
}
package MCQ;

// output will be 60
public class qthree {
    public static void main(String[] args) {
        new Car();
    }
}

class Car {
    int speed;

    Car() {
        System.out.println("speed of Car: " + speed);
    }

    {
        speed = 60;
    }
}

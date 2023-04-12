package Box_Program;
public class Main {
    public static void main(String[] args) {
        Box box = new Box(4,3,2);
        double volume = box.w * box.h * box.l;
        System.out.println(box.l + " " + box.w + " " + box.h);
        System.out.println("Volume: " + volume);
        box.volume();
        // BoxWeight box3 = new BoxWeight();
        // BoxWeight box4 = new BoxWeight(2, 3, 4, 8);
        // Box box5 = new BoxWeight(2, 3, 4, 8);
        // System.out.println(box5.w);// this you can access because box5 is the Box type
        // var therefore you can access the Box class data attributes
        // System.out.println(box5.weight); this will not work
        // child ref var and parent obj will not work vice versa will work
        // BoxWeight box6 = new Box(2, 3, 4);// this will not work
        // BoxPrice boxprice = new BoxPrice(3, 8, 200);
    }
    
}

public class Box {
    double l, h, w;
    // double weight;

    Box() {
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    Box(double side) {
        this.l = side;
        this.w = side;
        this.h = side;
    }

    Box(double l, double h, double w) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box(Box old) {
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }

    public void information() {
        System.out.println("Running in the box");
    }

    public void volume() {
        System.out.println("Volume is: ");
        System.out.println(w * h * l);
    }
}

 class BoxWeight extends Box {
    double weight;

    BoxWeight() {
        this.weight = -1;
    }

    BoxWeight(double l, double w, double h, double weight) {
        super(l, w, h); // call the parent class constructorsdsd
        this.weight = weight;
        // System.out.println(super.weight);
        // System.out.println(this.weight);
    }

    BoxWeight(BoxWeight other) {
        super(other);
        this.weight = other.weight;
    }

    BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }
}

class BoxPrice extends BoxWeight {
    double cost;

    BoxPrice(BoxPrice other) {
        super(other);
        this.cost = other.cost;
    }

    BoxPrice(double l, double h, double w, double weight, double cost) {
        super(l, h, w, weight);
        this.cost = cost;
    }

    BoxPrice(double side, double weight, double cost) {
        super(side, weight);
        this.cost = cost;
    }
}
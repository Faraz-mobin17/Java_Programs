package Foundation.Annotations;
// functional interface

// interface Demo {
//     void display();
//     void display2(); 
// }

@FunctionalInterface
interface Demo {
    void display();
    // void abc(); uncomment this it will give you error because annotation is used
}

class Plane {
    public void planeFilesAtGoodHeight() {
        System.out.println("Plane flies at good height");
    }
}

class CargoPlane extends Plane {
    // plane flies at good height
    // public void planefilesAtGoodHeight() {
    // System.out.println("Plane Flines at good height");
    // }
    // the above good is not giving error use annotation it will tell you the error
    // the above func name is wrong and your IDE will not give you error
    // use annotation to tell it is overridden method to tell IDE to give you error
    // if the func name is wrong
    @Override
    public void planeFilesAtGoodHeight() {
        System.out.println("Plane Flines at good height");
    }
}

public class Main {
    public static void main(String[] args) {

    }
}

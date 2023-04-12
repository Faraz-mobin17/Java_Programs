package Foundation.Inheritance;
/*
 * we cannot extends String, StringBuilder, StringBuffer etc. because they are final
 */
public class UseOfFinal {
    public static void main(String[] args) {
      Bmw x3 = new Bmw();
      x3.color();
    }
}

// final class Car {
//     void color() {
//         System.out.println("red");
//     }
// }

// class BWM extends Car { // cannot extends because of final keyword

// }


class Car {
    final int price = 1000;
    final void color() {
        // price = 12000; // will throw error final var cannot be changed
        System.out.println("red");
    }
}
// class Bmw extends Car {
// // inherited method color here will work but we cannot overide it
// }

class Bmw extends Car {
    void color() {
        System.out.println("throw error");
    }
}
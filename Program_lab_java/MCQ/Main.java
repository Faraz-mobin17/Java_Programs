package MCQ;

// child class  construcotr k andar parent class ka constructor chipa hota hai
// super keyword calling from child class 
public class Main {
    public static void main(String[] args) {
        SubStaticClass obj = new SubStaticClass();
    }
}

class StaticCons {
    public StaticCons() {
        System.out.println("Static cons");
    }
}

class SubStaticClass extends StaticCons {

    SubStaticClass() {
        System.out.println("sub class cons");
    }
}

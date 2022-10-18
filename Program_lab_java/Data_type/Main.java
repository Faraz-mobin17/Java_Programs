package Data_type;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        TestOverriding obj1 = new TestOverriding();
        obj1.method();
        Boverride obj2 = new Boverride();
        obj2.method();
    }
}

class TestOverriding {
    Object method() {
        System.out.println("Super");
        return 0;
    }
}

class Boverride extends TestOverriding {
    Number method() {
        System.out.println("Subclass");
        return 0;
    }
}
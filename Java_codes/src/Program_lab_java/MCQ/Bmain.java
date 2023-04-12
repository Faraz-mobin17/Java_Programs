package MCQ;

// OUTPUT will be main method parent
class Amain {
    public static void main(String[] args) {
        System.out.println("main method parent");
    }
}

class Bmain extends Amain {
    public static void main(String[] args) {
        System.out.println("Main method Child");
    }
}
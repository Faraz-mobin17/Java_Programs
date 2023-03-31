package Foundation.TypesOfVar;

public class Scope {
    public static void main(String[] args) {
        int x;
        System.out.println("hello");
        System.out.println(x); // ct error var may have not been initialized if we are not using then it is not required to perform initialization

        int y;
        if (args.length > 0) {
            y = 20;
        }
        System.out.println(y); // this will throw ct error what if programmer does'nt pass cmdlnargs 

         int z;
        if (args.length > 0) {
            z = 10;
        }
        else {
            z = 20;
        }
        System.out.println(z); // will not throw error because of if block

        int w = 0; // good practice always initialize with default val to avoid error
        if (args.length > 0) {
            w = 10;
        }
        System.out.println(w);

        public int a = 0; // not a modifier for var the only applicable for local var is final
        private int b = 0; // illegal modifier for ct error illegal start of expression
        protected int c = 0; // illegal modifier for. ct error illegal start of expression
        volatile int e = 0; // illegal modifier for.ct error illegal start of expression 
        transient int f = 0; // illegal modifier for. ct error illegal start of expression 
        static int g = 0; // illegal modifier for b.ct error illegal start of expression
        final int h = 0; // will work fine

    }
}

package Foundation.Inheritance;
// parent of all the classes in java is object class
// we cannot use multiple inheritance 
/*
 * java doesnot allow multiple inheritance because of ambiguity problem 
 * in this if we call age java cannot differentiate which age varible to call
 */
class Parent1 {
    int age = 19;
}

class Parent2 {
    int age = 18;
}

class Child extends Parent1, Parent2 {

}

public class Inheritance6 {
    public static void main(String[] args) {
        
    }
}

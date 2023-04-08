package Foundation.Static;

/*
 * which method should be static and which shouldn't be static 
 * method that is using atleast one instance var must be non static
 * method that is not using any instance var must be declared static
 * ====
 * for static method implementation should be available for instance methods implementation shouldn't be present
 */
public class Student {
    String name;
    int roll;
    int marks;
    static String cname;

    public String getStudentInfo() {
        return (name + " " + marks);
    }

    public static String getCollegeInfo() { // this method shoudl be declated static
        return cname;
    }

    public static int getAvg(int x, int y) { // this should be declared static
        return (x + y / 2);
    }

    public String getCompleteInfo() {
        return name + " " + roll + " " + marks + " " + cname;
    }

    public static void main(String[] args) {

    }
}

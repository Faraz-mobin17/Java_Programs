package MCQ;

public class Output {
    public static void main(String[] args) {
        System.out.println(Another.eName);
        
    }
}

class Another {
    static String eName = "faraz";
    static int EID;
    static int age;
    static String companyName = "TESLA";
    static {
        eName = "Shubham";
        System.out.println("Employee Name: " + eName);
    }
    static {
        EID = 1234;
        System.out.println("Employee ID: " + EID);
    }
}
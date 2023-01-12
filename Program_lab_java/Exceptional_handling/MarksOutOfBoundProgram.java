package Exceptional_handling;

public class MarksOutOfBoundProgram {
    public static void main(String[] args) {
        int marks = -1;
            try {
                if (marks > 100 || marks < 0) {
                    throw new MarksOutOfBoundException("Marks is greater than 100");
                }
            } catch (MarksOutOfBoundException e) {
                System.out.println(e);
            }
        
    }
}
class MarksOutOfBoundException extends Exception {
    MarksOutOfBoundException(String str) {
        super(str);
    }
}


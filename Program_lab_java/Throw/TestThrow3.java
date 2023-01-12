package Throw;

class UserDefinedException extends Exception {
    public UserDefinedException(String str) {
        super(str);
    }
}

public class TestThrow3 {
    public static void main(String[] args) throws Exception {
        try {
            throw new UserDefinedException("This is user defined exception");
        } catch (UserDefinedException e) {
            // TODO: handle exception
            System.out.println("caught the exception");
            System.out.println(e.getMessage());
        }
    }
}

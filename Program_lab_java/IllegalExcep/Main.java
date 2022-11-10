package IllegalExcep;

public class Main {
    public static void main(String[] args) {
        try {

            String name_one = args[0];
            int marks_one = Integer.parseInt(args[1]);
            int marks_two = Integer.parseInt(args[2]);
            String name_two = args[3];
            int marks_three = Integer.parseInt(args[4]);
            int marks_four = Integer.parseInt(args[5]);

            if ((marks_one < 0 || marks_one > 100 || marks_two < 0 || marks_two > 100 || marks_three < 0
                    || marks_three > 100 || marks_four < 0 || marks_four > 100)) {
                throw new IllegalArgumentException("Illegal argument exception");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            throw e;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }
}

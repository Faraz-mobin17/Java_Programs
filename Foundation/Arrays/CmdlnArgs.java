package Foundation.Arrays;

public class CmdlnArgs {
    public static void main(String[] args) {
        /*
         * for ouput CmdlnArgs a b c it will print 
         * a
         * b
         * c
         * then it will throw runtime exception
         * for output CmdlnArgs empty means no input
         * it will throw runtime exception
         */
        for (int i = 0; i <= args.length; i +=1) {
            System.out.println(args[i]);
        }
        /*
         * run this code java CmdlnArgs a b c or a b or empty means no input in all cases we will get output as shown below
         * now what will happen is args will stop pointing to a b c
         * and it will start pointing to A b C d and print A b C d
         */
        String[] argv = {"A","b","C","d"};
        args = argv;
        for(String s : args) {
            System.out.println(s);
        }
    }
}

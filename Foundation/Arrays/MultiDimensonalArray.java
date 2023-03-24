package Foundation.Arrays;
/*
 * refer to durga soft array video part 2 from ocjp/scjp series 
 */
public class MultiDimensonalArray {
    public static void main(String[] args) {
        int[][] arr = new int[2][];
        arr[0] = new int[2];
        arr[1] = new int[3];

        int[][][] $3d = new int[2][][];
        $3d[0] = new int[3][];
        $3d[0][0] = new int[1];
        $3d[0][1] = new int[2];
        $3d[0][2] = new int[3];

        $3d[1] = new int[2][2];
        $3d[1][0] = new int[2];
        $3d[1][1] = new int[2];
    }
}

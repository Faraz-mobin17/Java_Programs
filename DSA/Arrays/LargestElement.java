package DSA.Arrays;
import java.util.Arrays;
public class LargestElement 
{
	public static void findLargest(int[] arr) 
	{
		Arrays.sort(arr);
		System.out.println(arr[arr.length - 1]);
	}
	public static void main(String[] args) {
		int[] arr = {3,2,1,5,2};
		findLargest(arr);				
	}	
}

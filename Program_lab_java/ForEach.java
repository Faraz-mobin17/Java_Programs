public class ForEach {
	public static void main(String args[]) {
		String arr[] = {"faraz","ankita","meghna","shubham"};
		int arr2[] = {1,2,3,4,5,6,9,0};
		for (String i : arr) {
			System.out.println(i);
		}
		// add 1 to every Number
		for (int i : arr2) {
			System.out.println(i + 1);
		}
	}
}
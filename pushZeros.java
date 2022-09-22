 class PushZeros {


	static void sortZeros(int[] arr, int n) {
		int i = 0, k = 0;
		while (i < n) {
			if (arr[i] != 0) {
				int temp = arr[k];
				arr[k] = arr[i];
				arr[i] = temp;
				k++;
			}
			i++;
		}
	}

	public static void main(String args[]) {
		int arr[] = {2,0,0,1,3,0,0};
		sortZeros(arr,7);
		for (int i = 0; i < 7; i += 1) {
			System.out.print(arr[i]);
			System.out.print(" ");
		}
	} 

}
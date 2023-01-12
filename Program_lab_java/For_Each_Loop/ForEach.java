// complete java reference page no 92.
// for(type itr-var : collection) statement-block


public class ForEach {
	public static void main(String args[]) {
		Sum first = new Sum();
		Sum second = new Sum();
		first.sum();
		second.sum2();
	}
}

class Sum {
	// using for loop
	void sum() {
		int nums[] = { 1, 2, 3, 4, 5 };
		int _sum = 0;
		for (int i = 0; i < nums.length; i += 1) {
			System.out.println("Value is: " + i);
			_sum += nums[i];
		}
		System.out.println(_sum);
	}

	// using for each loop
	void sum2() {
		int nums[] = { 1, 2, 3, 4, 5 };
		int _sum = 0;
		for (int i : nums) {
			System.out.println("Value is: " + i);
			_sum += i;
		}
		System.out.println(_sum);
	}
}

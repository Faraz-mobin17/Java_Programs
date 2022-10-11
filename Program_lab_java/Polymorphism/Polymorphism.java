package Polymorphism;

public class Polymorphism {
	public static void main(String[] args) {
		Test example = new Test();
		// example.add(5,4);
		// example.add(5.5f,3.5f);
		// example.add(5.55,3.55);
		// example.add("abc",5);
		// example.add(3,"abc");
		example.add('a');
		// example.add('abc'); // error
		example.add("a");
	}
}

class Test {
	void add(String x) {
		System.out.println(x);
	}

	void add(int x) {
		System.out.println(x);
	}

	void add(int x, int y) {
		System.out.println("Int add: " + x + " " + y);
		System.out.println(x + y);
	}

	void add(float x, float y) {
		System.out.println("float add: " + x + " " + y);
		System.out.println(x + y);
	}

	void add(double x, double y) {
		System.out.println("Double add: " + x + " " + y);
		System.out.println(x + y);
	}

	void add(String x, int y) {
		System.out.println("String and Int add: " + x + " " + y);
		System.out.println(x + y);
	}

	void add(int x, String y) {
		System.out.println("String and Int add: " + x + " " + y);
		System.out.println(x + y);
	}
}
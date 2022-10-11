public class Polymorphism {
	public static void main(String[] args) {
		Test fourth = new Test();
		// fourth.add(5,4);
		// fourth.add(5.5f,3.5f);
		// fourth.add(5.55,3.55);
		// fourth.add("abc",5);
		// fourth.add(3,"abc");
		fourth.add('a');
		// fourth.add('abc'); // error
		fourth.add("a");
	}
}

class Test {
	void add(String x) {System.out.println(x);}
	void add(int x) {System.out.println(x);}

	void add(int x,int y) {
 		System.out.println("Int add: " + x +  " " + y);
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
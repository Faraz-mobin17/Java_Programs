 class A {
	
	int roll_no = 25;
	String name = "faraz";

public static void main(String args[]) {

		B student = new B();
		A newStudent = new A();
		System.out.println(student.roll_no);
		System.out.println(student.name);
		System.out.println(newStudent.roll_no);
		System.out.println(newStudent.name);

	}

}
 class B extends A {
	int roll_no = 23;
	String name = "meghna";
}

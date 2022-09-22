class HelloWorld {
    int salary = 1000;
}

class Programmer extends HelloWorld {
    int bonus = 300;
       public static void main(String[] args) {
        Programmer student = new Programmer();
        System.out.println("Programmer Salary: "  + student.salary);
        System.out.println("Programmer Bnous: "  + student.bonus);
    }
}
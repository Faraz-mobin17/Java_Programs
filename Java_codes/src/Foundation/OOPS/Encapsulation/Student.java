package Foundation.OOPS.Encapsulation;

/*
 * binding of data memebers and and corresponding method is a example of encapsulation
 * encapsulation = data hiding + abstraction
 */
public class Student {
    private int age;
    private String name;

    public void setData() {
        age = 18;
        name = "faraz";
    }

    public void setData2(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void show() {
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Student obj = new Student();
        // System.out.println(obj);
        // System.out.println(obj.age + " " + obj.name);
        // obj.age = 18;
        // obj.name = "faraz";
        // System.out.println(obj.age + " " + obj.name);
        // now declare both the varible private
        obj.setData();
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
        obj.setData2(23, "java");
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
}

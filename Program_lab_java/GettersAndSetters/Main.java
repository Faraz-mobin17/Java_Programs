package GettersAndSetters;

public class Main {
    public static void main(String[] args) {
        Person obj = new Person();
        // obj.name = "faraz";
        // System.out.println(obj.name);
        obj.setName("teenu");
        System.out.println(obj.getName()); 
    }
}
 class Person {
    private String name;
    public void setName(String name) {   
        this.name = name;
    }
    public String getName() {
        return name;
    }
}


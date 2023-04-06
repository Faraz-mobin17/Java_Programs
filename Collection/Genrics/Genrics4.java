package Collection.Genrics;

public class Genrics4 {
    public static void main(String[] args) {
        Gen<Integer> g = new Gen<Integer>(10);
        Gen<Integer> g2 = new Gen<Integer>();
        g.display();
        System.out.println(g.getData());

        g2.display();
        System.out.println(g2.getData());
    }
}

class Gen<T> {
    private T data;

    public Gen() {
    }

    public Gen(T data) {
        this.data = data;
    }

    public void display() {
        System.out.println("The type of data is: " + data.getClass().getName());
    }

    public T getData() {
        return data;
    }
}
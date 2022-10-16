package Box_Program;

public class Main {
    public static void main(String[] args) {
        // Box box = new Box(4,3,2);
        // double volume = box.w * box.h * box.l;
        // System.out.println(box.l + " " + box.w + " " + box.h);
        // System.out.println("Volume: " + volume);
        // box.volume();
        // BoxWeight box3 = new BoxWeight();
        // BoxWeight box4 = new BoxWeight(2, 3, 4, 8);
        Box box5 = new BoxWeight(2, 3, 4, 8);
        System.out.println(box5.w);// this you can access because box5 is the Box type
        // var therefore you can access the Box class data attributes
        // System.out.println(box5.weight); this will not work
        // child ref var and parent obj will not work vice versa will work
        // BoxWeight box6 = new Box(2, 3, 4);// this will not work
        // BoxPrice boxprice = new BoxPrice(3, 8, 200);
    }
}

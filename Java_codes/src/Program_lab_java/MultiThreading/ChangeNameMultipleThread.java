package Program_lab_java.MultiThreading;

public class ChangeNameMultipleThread {

    
        public static void main(String args[]){
            //creating threads
            TestMultipleNaming t1= new TestMultipleNaming ();
            TestMultipleNaming t2= new TestMultipleNaming ();
            TestMultipleNaming t3= new TestMultipleNaming ();
            TestMultipleNaming t4= new TestMultipleNaming ();
            TestMultipleNaming t5= new TestMultipleNaming ();
        
            System.out.println("Name of 1st thread: "+t1.getName());
            System.out.println("Name of 2nd thread: "+t2.getName());
            System.out.println("Name of 3rd thread: "+t3.getName());
            System.out.println("Name of 4th thread: "+t4.getName());
            System.out.println("Name of 5th thread: "+t5.getName());
        
            t1.start();
            t2.start();
            t3.start();
            t4.start();
            t5.start();
        
            t1.setName("Rajesh Sir Java1");
            t2.setName("Rajesh Sir Java2");
            t3.setName("Rajesh Sir Java3");
            t4.setName("Rajesh Sir Java4");
            t5.setName("Rajesh Sir Java5");
    
            System.out.println("Name of 1st thread after changing: "+t1.getName());
            System.out.println("Name of 2nd thread after changing: "+t2.getName());
            System.out.println("Name of 3rd thread after changing: "+t3.getName());
            System.out.println("Name of 4th thread after changing: "+t4.getName());
            System.out.println("Name of 5th thread after changing: "+t5.getName());
 
    }
    
}
class TestMultipleNaming extends Thread{
    public void run(){
        System.out.println("Inside Run method");
    }
}
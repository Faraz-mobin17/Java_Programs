package MultiThreading;

public class HandlingExcepUsingStart {
 
    
        public static void main(String args[]){
            MyThread t= new MyThread();
            try{
                t.start();
                t.start();
            }
            catch(IllegalThreadStateException e){
                System.out.println(e);
            }
        }
    
    
    
}

class MyThread extends Thread{
    public void run(){
System.out.println("Current thread name: "+Thread.currentThread().getName());
        System.out.println("run() method called");
    }
}
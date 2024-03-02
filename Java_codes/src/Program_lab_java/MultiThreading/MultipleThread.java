package Program_lab_java.MultiThreading;

public class MultipleThread{
	public static void main(String[] args) {
		try{
			Thread1 thread1= new Thread1();
			Thread2 thread2= new Thread2();
			Thread3 thread3= new Thread3();
			thread1.start();
			thread2.start();
			thread3.start();
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
}


class Thread1 extends Thread{
	public void run(){
		System.out.println(" Thread 1 is started ");
		for(int i=101; i<200; i++)
		System.out.print(i + " ");
	}
}
class Thread2 extends Thread{
	public void run(){
		System.out.println(" Thread 2 is started ");
		for(int i=201; i<300; i++)
		System.out.print(i + " ");
	}
}
class Thread3 extends Thread{
	public void run(){
		System.out.println(" Thread 3 is started ");
		for(int i=301; i<400; i++)
		System.out.print(i + " ");
	}
}

package Program_lab_java.MultiThreading;
public class DeadLock {
	public static void main(String args[]){
		//TODO Auto-generated method stub
		NumVal v = new NumVal();
//Creating thread1 that want exclusive lock on object referred by v
		MyThread thread1 = new MyThread("Thread1 ", v);
//Creating thread2 that want exclusive lock on object referred by v
		MyThread thread2 = new MyThread("Thread2 ", v);
/*thread1 is not going to release lock on Object referred by v until resume() method is not called and for acquiring lock on v Object referred by v, thread1 must have released lock on Object referred by v, if lock is not released , thread2 will keep on waiting for thread1 to release lock on object referred by v & DEADLOCK will be formed*/
		//starting both threads
		thread1.start();
		thread2.start();
		for(int i=500; i<=501; i++){
			System.out.println("Main Thread " + i);
		}
	}
}
class NumVal{
	private int num[] = null;
	boolean valueSet = false;
	int i=0;
	NumVal(){
		//creating integer array of 10 elements
		num = new int[10];
	}
	//method to set the values in array
	public void setVal(int n){
		if(i<9){
			System.out.println("Putting value "+ n +" in the NumVal array");
			num[i] = n;
			i++;
		}
	}
	//method to get the values from the array
	public int getVal(){
		if(i>=0){
			System.out.println("Giving n = " +num[i]);
			i--;
			return num[i+1];
		}
		else{
			return -1;
		}
	}
}
//Crating our Thread Class
class MyThread extends Thread{
//MyThread want mutually exclusive lock on the object referred by :NumObjToSetVal
	NumVal NumObjToSetVal = null;

	//Constructor
	public MyThread(String threadName, NumVal numV){
		super(threadName);
		NumObjToSetVal = numV;
	}
	public void run(){
	//Only 1 thread at a time can access the object referred by : NumObjToSetVal
		synchronized (NumObjToSetVal){
			int n=0;
			while(n<5){
System.out.println("THREAD NAME : " + Thread.currentThread().getName());
				n++;
				NumObjToSetVal.setVal(n);
				try{
					//Make the thread sleep for 100ms 
					Thread.sleep(100);	
System.out.println(Thread.currentThread().getName() + " is awake now");
				}
				catch(Exception e){
					System.out.println("Exception Caught");
				}
				//If n is 2, we suspend this thread
				if(n==2){
/*suspend the thread, now this thread will release lock on NumObjToSetVal only when resume() method is called on this thread, thread will go in waiting state*/
					Thread.currentThread().suspend();
				}
			}
		}
	}
}



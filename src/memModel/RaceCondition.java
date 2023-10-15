package memModel;

public class RaceCondition {
	public static void main(String[] args) {
//		Race Condition / Update Visibility problem
		Runnable runnable = new MyRunnable();
		
		Thread t1 = new Thread(runnable, "Thread_1");
		Thread t2 = new Thread(runnable, "Thread_2");
		t1.start();
		t2.start();
	}
}

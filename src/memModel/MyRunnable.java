package memModel;

public class MyRunnable implements Runnable {
	int	counter = 0;
	
	@Override
	public void run() {
		for  (int i = 0; i < 1000000; i++) {
			this.counter++;
		}
		System.out.println(Thread.currentThread().getName() + " : " + this.counter);
	}

}

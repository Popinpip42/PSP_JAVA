package print_nums;

public class Main_printNums {
	static final Object lock = new Object();
	static int num = 1;
	public static void main(String[] args) {
		int size = 5;
		
		while (size-- > 0)
		{
			Thread nums_t1 = new Print_nums_T();
			Thread nums_t2 = new Print_nums_T();
			nums_t1.start();
			nums_t2.start();
		}
	}
}

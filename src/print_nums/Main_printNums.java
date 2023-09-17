package print_nums;

public class Main_printNums {
	static final Object lock = new Object();
	static int num = 1;
	public static void main(String[] args) {
		int n_threads = 2;
		int	i = 0;
		while (i < n_threads)
		{
			Thread nums_t = new Print_nums_T();
			nums_t.start();
			i++;
		}
	}
}

package print_nums;

public class Main_printNums {
	public static void main(String[] args) {
		Thread nums_t = new Print_nums_T(10);
		nums_t.start();
		Thread nums_t2 = new Print_nums_T(10);
		nums_t2.start();
	}
}

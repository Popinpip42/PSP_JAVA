package print_nums;

public class Print_nums_T extends Thread{	
	
	@Override
	public void run()
	{
		synchronized (Main_printNums.lock) {
			if (Main_printNums.num % 2 == 0) {
				System.out.println("Even: " + Main_printNums.num );
				Main_printNums.num ++;
			}else if (Main_printNums.num  % 2 != 0) {
				System.out.println("Odd : " + Main_printNums.num );
				Main_printNums.num ++;
			}
		}
	}
}

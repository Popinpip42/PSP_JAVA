package print_nums;

public class Print_nums_T extends Thread{
	public int size;
	
	public Print_nums_T(int size) {
		this.size = size;
	}	
	
	@Override
	public void run()
	{
//		int i = 1;
//		while (size-- > 0)
//			System.out.println(i++);
		int i = 0;
		while (i < size)
		{
			System.out.println(i+1);
			i++;
		}
	}
}

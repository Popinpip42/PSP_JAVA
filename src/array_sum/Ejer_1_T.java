package array_sum;

public class Ejer_1_T extends Thread{
	public int[] arr;
	public int index;
	public int task_size;
	public int result;
	
	public Ejer_1_T(int[] arr, int index, int task_size) {
		this.arr = arr;
		this.index = index;
		this.task_size = task_size;
		this.result = 0;
	}
	
	@Override
	public void run() {
		int i = 0;
		while (i < task_size)
		{
			result += arr[index + i]; 
			//System.out.println(result + ", ");
			i++;
		}
	}
	
	public int	getResult()
	{
		return this.result;
	}
}

package array_sum;

public class Ejer1 {
	public static void main(String[] args) throws InterruptedException{
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10};
		int result = 0; //Race condition...
		//int	n_threads = Integer.valueOf(args[0]);
		int n_threads = 3; // n_thread can not be greater than arr.length or 0 
		if (n_threads < 1 || n_threads > arr.length)
		{
			System.out.println("Invalide n_threads");
			System.exit(1);
		}
		Ejer_1_T[] threads = new Ejer_1_T[n_threads];
		
		//Threads Genesis
		int task_size = arr.length / n_threads;
		int remaining_chunk = arr.length % n_threads;
		
		int index = 0;
		for (int i = 0; i < n_threads; i++) {
			threads[i] = new Ejer_1_T(arr, index, task_size);
			threads[i].start();
			index += task_size;
		}
		
		//Wait for Threads to finish and compute result
		for (int i = 0; i < n_threads; i++) {
			threads[i].join();
			synchronized (Ejer1.class){
				result += threads[i].getResult(); //<-------- CRITICAL SECTION!!!!!!!!!!!!
			}
		}

		//Compute remaining elements
		for (int i = 0; i < remaining_chunk; i++)
			result += arr[index + i];
		
		//System.out.println(index + ", " + remaining_chunk);
		System.out.println("Final Result: " + result);
	}
}

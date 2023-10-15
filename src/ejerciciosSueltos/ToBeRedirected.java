package ejerciciosSueltos;

public class ToBeRedirected {
	public static void main(String[] args) {
		//StdError write on purpose
		System.out.println("Error Comming...");
		int[] arr = new int[2];
//		For writing stoud into output.txt
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
//		For writing stderror into output.txt
//		for (int i = 0; i < arr.length + 1; i++) {
//			System.out.println(arr[i]);
//		}
	}
}

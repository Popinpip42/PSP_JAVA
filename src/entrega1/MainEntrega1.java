package entrega1;

import java.io.*;

public class MainEntrega1 {
	public static void main(String[] args) {
		if (args.length == 2) {
			try {
				int num1 = Integer.parseInt(args[0]);
				int num2 = Integer.parseInt(args[1]);
				if (isValidSum(num1, num2)) {
					ProcessBuilder pb = new ProcessBuilder("java", "MainEntrega2.java");
					pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);

					Process p2 = pb.start();
					DataOutputStream dos = new DataOutputStream(p2.getOutputStream());
					dos.writeInt(num1);
					dos.writeInt(num2);
					dos.flush();
					dos.close();

					if (p2.waitFor() == 0) {
						System.out.println("Ejecución exitosa");
					} else {
						System.out.println("Ejecución fallida." 
										+ "\nAsegurese de tener permisos de ejecución sobre el subproceso."
										+ "\nAsegurese de que el nombre del subproceso es correcto");
					}
				} else {
					System.out.println("Error al realizar la suma\nMax Number: " + Integer.MAX_VALUE + "\nMin Number: " + Integer.MIN_VALUE);
				}
			} catch (NumberFormatException e) {
				System.out.println("Los número que has introducido no siguen un formato válido" 
								+ "\nIntroduce números válidos: " + Integer.MIN_VALUE + "..." + Integer.MAX_VALUE);
			} catch (IOException | InterruptedException e) {
				System.out.println("Error en la ejecución del segundo proceso");
			}
		} else {
			System.out.println("Número de Argumentos no válidos\nIntroduce dos argumentos: num1 num2");
		}
	}

	private static boolean isValidSum(int num1, int num2) {
		if (num2 > 0) {
			return num1 <= Integer.MAX_VALUE - num2;
		} else if (num2 < 0) {
			return num1 >= Integer.MIN_VALUE - num2;
		}
		return true;
	}
}

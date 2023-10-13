package entrega1;

import java.io.*;

public class MainEntrega2 {
	public static void main(String[] args) {
		try {
			DataInputStream dis = new DataInputStream(System.in);
			int num1 = dis.readInt();
			System.out.println("NUM 1: " + num1);
			int num2 = dis.readInt();
			System.out.println("NUM 2: " + num2);
			dis.close();
			
			int result = num1 + num2;
			System.out.println("RESULTADO: " + result);
			System.out.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

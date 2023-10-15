package ejerciciosSueltos;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class RedirectToFile {
	public static void main(String[] args) {
		ProcessBuilder pb = new ProcessBuilder("java", "ToBeRedirected.java");
//		File stdin = new File ("stdin.txt");
		File stdoutError = new File ("output.txt"); //When p2 writes to stderror, stdout is not saved into output.txt
		pb.redirectOutput(stdoutError);
		pb.redirectError(stdoutError);
		pb.redirectInput(ProcessBuilder.Redirect.INHERIT);
//		pb.redirectInput(stdin);

		try {
			Process p2 = pb.start();
//			InputStream from parent is the same as p2
//			By reading from parent stdin, we can write to p2 stdin
			InputStream in = System.in;
			byte[] buffer = new byte[5];
			in.read(buffer);
			for (int i = 0; i < buffer.length; i++) {
				System.out.print((char)buffer[i] + "\n");
			}
			p2.waitFor();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
	}
}

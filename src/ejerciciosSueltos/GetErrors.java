package ejerciciosSueltos;

import java.io.File;
import java.io.IOException;

public class GetErrors {
	public static void main(String[] args) throws IOException {
		//Redirection of stderror when executing a non-existing .java file
		ProcessBuilder pb = new ProcessBuilder("java", "noExisto.java");
		pb.redirectError(new File("error.log"));
		pb.start();
	}
}

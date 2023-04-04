package Atividade1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Executa {
  public static void main(String[] args) throws IOException {
	
		
		for (int i = 0; i < 50; i++) {
			
			generateLog("I = " + i);
			
		}

	}
	
	public static void generateLog(String message) throws IOException {
		
		Path path = Paths.get("C:/Users/Usuario/Desktop/dev/");
		
		if(!Files.exists(path)) {
			
			Files.createDirectory(path);
			
		}
		
		File log = new File("C:/Users/Usuario/Desktop/dev/logs.txt");
		
		if(!log.exists()) {
			
			log.createNewFile();
		
		}
		
		FileWriter fw = new FileWriter(log, true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write(message);
		bw.newLine();

		bw.close();
		fw.close();
		
	}
}

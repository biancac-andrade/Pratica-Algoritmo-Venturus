package Arquivos;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Exemplo1 {
  public static void main(String[] args) {
		try {
			RandomAccessFile file = new RandomAccessFile("sample.txt", "r");
			String str;

			while ((str = file.readLine()) != null) {
				System.out.println(str);
			}

			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

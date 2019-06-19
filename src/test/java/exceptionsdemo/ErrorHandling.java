package exceptionsdemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ErrorHandling {

	public static void main(String[] args) {

		BufferedReader reader = null;
		int total = 0;

		try {
			reader = new BufferedReader(new FileReader("C:\\Users\\nijat\\example\\Numbers.txt"));
			String line = null;
			while ((line = reader.readLine()) != null) {
				total += Integer.valueOf(line);
			}
			System.out.println("Total: " + total);

		} catch (FileNotFoundException e) {
			System.out.println("File not found, please create a file and try again.");
			System.out.println("This program is terminating..");

		} catch (NumberFormatException e) {
			System.out.println("Content of the file is not a number, please clean up the file.");
			System.out.println("Only the integer number is allowed");
			System.out.println("This program is terminating..");

		} catch (IOException e) {
			System.out.println("I/O operation is corrupted..try again later");
		} catch (Exception e) {
			System.out.println("Some unknown error happend...sending log to microsoft");
		}
		
		System.out.println("POWER OFF!");
	}

}

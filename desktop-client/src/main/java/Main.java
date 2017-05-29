import java.io.IOException;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<String> info = Lib.readFileByLine("C:/Users/kevin/Documents/thebest/first_file.txt");
		for (String line : info){
			System.out.println(line);
		}
		System.out.println("Hi");
	
	}
}

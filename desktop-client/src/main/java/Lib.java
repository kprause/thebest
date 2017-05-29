import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Lib {

	public static ArrayList<String> readFileByLine(String path)throws IOException {	
			
		ArrayList<String> lines = new ArrayList<String>();
		FileInputStream fis = new FileInputStream(path);
		 
			//Construct BufferedReader from InputStreamReader
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		 
			String line = null;
			while ((line = br.readLine()) != null) {
				lines.add(line);
			}
			br.close();
			
			return lines;
	}
	
	
}

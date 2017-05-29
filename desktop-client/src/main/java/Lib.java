import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Lib {
	
	private static String localRootPath;
	
	public static String getLocalRootPath(){
		if (localRootPath == null){
			try {
				 localRootPath = new java.io.File( "." ).getCanonicalPath();
			} catch (IOException e) {
				localRootPath = "The local path can not be read.";
				e.printStackTrace();
			}
		}
		return localRootPath;
	}

	public static ArrayList<String> readFileByLine(String path){			
		ArrayList<String> lines = new ArrayList<String>();
		FileInputStream fis;
		String line = null;
		try {
			fis = new FileInputStream(path);
			//Construct BufferedReader from InputStreamReader
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
			while ((line = br.readLine()) != null) {
				if (line.trim()!=""){
					lines.add(line.trim());
				}
			}
		
		
			br.close();
		} catch (IOException e) {
			lines.add("File: "+path+" can not be read!");
			e.printStackTrace();
		}
		return lines;
	}
	
	
}

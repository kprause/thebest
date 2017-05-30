import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
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
	
	public static String getDataFromUrl(String urlString){
		String result="";
		URL url;
		try {
			url = new URL(urlString);
		
        URLConnection urlCon = url.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(urlCon.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
        	result+=inputLine;
        }
        in.close();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return result;
	}
	
	
	
}

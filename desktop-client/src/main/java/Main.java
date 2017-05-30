import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		
		System.out.println(Lib.getDataFromUrl("http://thebest.sysgame.de/run.cgi/data"));
		System.out.println(Lib.getDataFromUrl("http://thebest.sysgame.de/run.cgi/toll"));
		
		ArrayList<String> info = Lib.readFileByLine(Lib.getLocalRootPath()+"/server.conf");
		for (String line : info){
			System.out.println(line);
		}
		System.out.println("Hi");
	
	} 
}

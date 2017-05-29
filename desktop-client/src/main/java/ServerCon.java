public class ServerCon {
	
	
	private static ServerCon instance;
	
	public static ServerCon getServerCon(){
		
		if (ServerCon.instance ==null){
			ServerCon.instance = new ServerCon();
		}
		return ServerCon.instance;
		
		
	}
	
	private ServerCon(){
		
	}
	
}

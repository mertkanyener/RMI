import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RmiClient {
	public static void main(String[] args){
		try{
			Registry regist = LocateRegistry.getRegistry("localhost");
			RemoteInterface rmiFunctions = (RemoteInterface)regist.lookup("bilgi");
			System.out.println(rmiFunctions.hello()); // call the remote function
		}catch(Exception e){
			System.out.println("Error in the RMI client");
		}
	}
}

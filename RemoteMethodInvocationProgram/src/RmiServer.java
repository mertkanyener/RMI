import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class RmiServer {
	public static void main(String[] args){
		try{
			// create an instance
			RmiServerImplementation server = new RmiServerImplementation();
			RemoteInterface shared = (RemoteInterface)UnicastRemoteObject.exportObject(server,0);
			Registry regist = LocateRegistry.getRegistry();
			regist.bind("bilgi", shared);
			System.out.println("Rmi server is ready");
		}catch(Exception e){
			System.out.println("Exceptions in the RMI server...");
		}
	}
}
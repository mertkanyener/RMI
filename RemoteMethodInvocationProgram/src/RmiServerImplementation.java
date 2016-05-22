import java.rmi.RemoteException;

public class RmiServerImplementation implements RemoteInterface {

	@Override
	public String hello() throws RemoteException {
		return "Greetings from the RMI server!";
	}	
}


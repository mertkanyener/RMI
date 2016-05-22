import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteInterface extends Remote {
	String hello() throws RemoteException;

}

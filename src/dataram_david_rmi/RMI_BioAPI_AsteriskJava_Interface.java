package dataram_david_rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMI_BioAPI_AsteriskJava_Interface extends Remote {
	public void RPC_FileRead(String Service_UID, String srcFileName, String socket_ip, int socket_port, String remote_fileName) throws RemoteException;

}

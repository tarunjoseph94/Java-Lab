import java.net.*;
public class InetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		
		InetAddress ip=InetAddress.getByName("msrit.edu");
		System.out.println("Host name: "+ip.getHostName());
		System.out.println("Host Address: "+ip.getHostAddress());
		
	
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

}

package chapter18.page17;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

public class Run3 {
	public static void main(String[] args) throws UnknownHostException {

		InetAddress ia1 = InetAddress.getByName("www.google.com");

		int port = 2000;
		InetSocketAddress isa1 = new InetSocketAddress(ia1, port);
		System.out.println(isa1);
		System.out.println(isa1.getHostName());
		System.out.println(isa1.getHostString());
		System.out.println(isa1.getPort());
		System.out.println(isa1.getAddress());
					
	}
}

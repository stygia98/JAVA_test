package chapter18.page17;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Run2 {
	public static void main(String[] args) throws UnknownHostException {
		
		InetAddress ia1 = InetAddress.getByName("www.google.com");
		System.out.println(ia1);
		
		InetAddress ia2 = InetAddress.getByAddress(new byte[] {(byte)192, (byte)168, 0, 98});
		System.out.println(ia2);
		
		InetAddress ia3 = InetAddress.getByAddress("www.kdj.com", new byte[] {(byte)192, (byte)168, 0, 98});
		System.out.println(ia3);
		
		InetAddress ia4 = InetAddress.getLocalHost();
		System.out.println(ia4);
		
		InetAddress ia5 = InetAddress.getLoopbackAddress();
		System.out.println(ia5);
		
		InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
		for (InetAddress inetAddress : iaArr) {
			System.out.println(inetAddress);
		}
		
	}
}

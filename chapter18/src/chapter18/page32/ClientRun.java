package chapter18.page32;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class ClientRun {

	public static void main(String[] args) throws IOException {
		
		System.out.println("<<Client>>");
		
		@SuppressWarnings("resource")
		Socket socket = new Socket(InetAddress.getByName("localhost"), 2000);
//		Socket socket = new Socket(InetAddress.getByAddress(new byte[] {(byte)192, (byte)168, (byte)0, (byte)9}), 3000);
		
		System.out.println("Server connected");
		System.out.printf("Server Address : %s\nServer Port : %s\n", socket.getInetAddress(), socket.getPort());

		DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
		DataInputStream dis = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
	
		
		String receiveMessage = dis.readUTF();
		System.out.printf("서버 : %s\n", receiveMessage);
				
		dos.writeUTF("자장면 배달해주세요\n");
		dos.flush();
	
		String receiveMessage2 = dis.readUTF();
		System.out.printf("서버 : %s\n", receiveMessage2);
				
	}

}

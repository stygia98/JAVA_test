package chapter18.page32;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Run {
	public static void main(String[] args) throws IOException {
		
		System.out.println("<<SERVER>>");

		@SuppressWarnings("resource")
		ServerSocket serverSocket = new ServerSocket(2000);
		Socket socket = serverSocket.accept();
		
		System.out.println("Client accepted");
		System.out.printf("Client Address : %s\nClient Port : %s\n", socket.getInetAddress(), socket.getPort());
	
		DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
		DataInputStream dis = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
		
	
		String sendMessage = "안녕하세요 고갱님\n";
		
		dos.writeUTF(sendMessage);
		System.out.printf("서버 : %s\n", sendMessage);

		dos.flush();
		
		String message = dis.readUTF();
		System.out.printf("클라 : %s\n", message);
		
		dos.writeUTF(message + "주문 처리됨, 감사합니다\n");
		dos.flush();
				
//		if(serverSocket != null && !serverSocket.isClosed()) serverSocket.close();
	
	}
}

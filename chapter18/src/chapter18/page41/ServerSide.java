package chapter18.page41;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSide {
	public static void main(String[] args) throws IOException {
		
		System.out.println("<<서버>>");

		ServerSocket serverSocket = null;
		serverSocket = new ServerSocket(4500);

		System.out.println("클라이언트 접속 대기중");
		Socket cSocket = serverSocket.accept();
		
		System.out.println("클라이언트 연결됨 >>>>>");
		System.out.printf("클라 주소 : %s\n클라 포트 : %d\n", cSocket.getInetAddress(), cSocket.getPort());

		DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(cSocket.getOutputStream()));
		DataInputStream dis = new DataInputStream(new BufferedInputStream(cSocket.getInputStream()));
		
		//========================================================================
	
		String fileName = dis.readUTF();
		System.out.printf("받을 파일명 : %s\n", fileName);
		
		File file = new File("src/serverData/" + fileName);
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));
		
		byte[] imageData = new byte[2048];
		int length = 0;
		
		while((length = dis.readInt()) != -1) {
			dis.read(imageData);
			bos.write(imageData, 0, length);
			bos.flush();
		}
		
		//========================================================================
		
		System.out.println("Server : 파일 받기 완료");
		
		dos.writeUTF("Server : 파일 받기 완료");
		dos.flush();

//		System.out.printf("%s", dis.readUTF());
				
		if(serverSocket != null && !serverSocket.isClosed()) serverSocket.close();
		if(bos != null) bos.close();

	}
}

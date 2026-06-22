package chapter18.page41;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class ClientSide {
	public static void main(String[] args) throws IOException {
		
		System.out.println("<<클라이언트>>");
		
		Socket sSocket = null;
//		sSocket = new Socket(InetAddress.getByName("localhost"), 3000);
		// my ip : "192.168.0.98"
		sSocket = new Socket(InetAddress.getByName("192.168.0.91"), 3000);
		sSocket = new Socket(InetAddress.getByName("193.186.4.167"), 3000);

//		sSocket = new Socket(InetAddress.getByAddress(new byte[] {(byte)192,(byte)168,(byte)0,(byte)91}), 3000);
//		sSocket = new Socket("192.168.0.91", 3000);

		System.out.println("서버 연결됨 >>>>>");
		System.out.printf("서버 주소 : %s\n서버 포트 : %d\n", sSocket.getInetAddress(), sSocket.getPort());

		DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(sSocket.getOutputStream()));
		DataInputStream dis = new DataInputStream(new BufferedInputStream(sSocket.getInputStream()));
		
		//========================================================================
		
		File file = new File("src/cat-temp.jpg");
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		
		System.out.printf("전송할 파일명 : %s\n", file.getName());
		dos.writeUTF(file.getName());
		dos.flush();

		byte[] imageData = new byte[2048];
		int length = 0;
		
		while((length = bis.read(imageData)) != -1) {
			dos.writeInt(length);
			dos.write(imageData);
			dos.flush();
		}
		dos.writeInt(length); // length = -1;
		dos.flush();
		
		//========================================================================
		
		System.out.println("Client : 파일 보내기 완료");
		
		System.out.printf("%s", dis.readUTF());
		
//		dos.writeUTF("Client : 파일 보내기 완료");
//		dos.flush();
				
		if(sSocket != null && !sSocket.isClosed()) sSocket.close();
		if(bis != null) bis.close();
	}

}

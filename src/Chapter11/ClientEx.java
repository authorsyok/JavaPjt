package Chapter11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ClientEx {
	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		ServerSocket listener = null;
		Socket socket = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			socket = new Socket("localhost", 9999);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) {
				System.out.print("������>>");
				String outputMessage = sc.nextLine();
				if(outputMessage.equals("bye")) {
					out.write(outputMessage + "\n");
					out.flush();
					break;
				}
				out.write(outputMessage + "\n");
				out.flush();
				String inputMessage = in.readLine();
				System.out.println("����: " + inputMessage);

			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				sc.close();
				socket.close();
			} catch (Exception e) {
				System.out.println("������ ä�� �� ������ �߻��߽��ϴ�.");
			}
		}
	}
}











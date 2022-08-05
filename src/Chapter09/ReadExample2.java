package Chapter09;

import java.io.*;
import java.util.*;

public class ReadExample2 {
	public static void main(String[] args) throws IOException{
		InputStream is = new FileInputStream("D:\\test.txt");
		int readByteNo;
		byte[] readBytes = new byte[3];
		
		while(true) {
			readByteNo = is.read(readBytes);
			System.out.println(readByteNo);
			if(readByteNo == -1) {
				break;
			}
			break;
		}
	}
}

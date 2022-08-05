package Chapter09;

import java.io.*;
import java.util.*;

public class ReadExample1 {
	public static void main(String[] args) throws Exception{
		InputStream is = new FileInputStream("D:\\test.txt");
		int readByte;
		
		while((readByte = is.read()) != -1) {
			System.out.print((char)readByte);
		}
		
//		while(true) {
//			readByte = is.read();
//			
//			if(readByte == -1) {
//				break;
//			}
//			System.out.print((char)readByte);
//
//		}
	}
}

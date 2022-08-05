package Chapter09;

import java.io.FileOutputStream;

import java.io.*;
import java.util.*;

public class WriteExample1 {
	public static void main(String[] args) throws IOException{
		OutputStream os = new FileOutputStream("D:\\output.txt");
		byte[] data = "ABC".getBytes();
		
		for(int i = 0; i < data.length; i++) {
			os.write(data[i]);
		}
	}
}

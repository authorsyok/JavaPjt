package Chapter05;

import java.util.Scanner;

//class Sentence {
//	StringBuilder sb = new StringBuilder();
//	
//	public void printStringArray() {
//		sb.append("to be or not to be");
//		sb.replace(3, 5, "eat");
//		sb.replace(17, 19, "eat");
//		System.out.println(sb);
//	}
//}
//public class ArrayParameterEx {
//	public static void main(String[] args) {
//		System.out.println("to be or not to be");
//		Sentence st = new Sentence();
//		st.printStringArray();
//	}
//}

public class ArrayParameterEx {
	
	static void replaceBe(String[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals("be")) {
				arr[i] = "eat";
			}
		}
	}
	
	static void printStringArray(String arr[]) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		String[] str = {"to", "be", "or", "not", "to", "be"};
		printStringArray(str);
		replaceBe(str);
		printStringArray(str);
	}
}

package Chapter08;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 4; i++) {
			System.out.print("�̸��� �Է� : ");
			String str = sc.next();
			a.add(str);
		}
		
		for(int i = 0; i < a.size(); i++) {
			String name = a.get(i);
			System.out.println(name + " ");
		}
		
		int longest = 0;
		for (int i = 0; i < a.size(); i++) {
			if(a.get(longest).length() < a.get(i).length()) {
				longest = i;
			}
		}
		System.out.println(a.get(longest));
		
	}
}
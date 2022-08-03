package Chapter08;

import java.util.ArrayList;

public class ArrayListExample2 {
	public static void main(String[] args) {
		
		ArrayList<String> array = new ArrayList<>();
		array.add("oracle");
		array.add("oracl");
		
		for (int i = 0; i < array.size(); i++) {
			String str = array.get(i);
			System.out.println(str);
		}
	}
}

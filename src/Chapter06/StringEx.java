package Chapter06;

public class StringEx {
	public static void main(String[] args) {
		String a = new String(" C#");
		String b = new String(", C++");
		System.out.println(a + "�� ���̴� " + a.length());
		System.out.println(a.contains("#"));
		
		a = a.concat(b);
		System.out.println(a);
		
		//trim()�� �������� 
		a = a.trim();
		System.out.println(a);
		
		a = a.replace("C#", "jAVA");
		System.out.println(a);
		
		String[] str = a.split(",");
		for(int i = 0; i < str.length; i++) {
			System.out.println("�и��� ���ڿ� " + i + ":" + str[i]);
		}
		
		//5���ͽ���
		a = a.substring(5);
		System.out.println(a);
	}
}

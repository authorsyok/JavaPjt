package Chapter06;

public class StringEx {
	public static void main(String[] args) {
		String a = new String(" C#");
		String b = new String(", C++");
		System.out.println(a + "의 길이는 " + a.length());
		System.out.println(a.contains("#"));
		
		a = a.concat(b);
		System.out.println(a);
		
		//trim()은 공백제거 
		a = a.trim();
		System.out.println(a);
		
		a = a.replace("C#", "jAVA");
		System.out.println(a);
		
		String[] str = a.split(",");
		for(int i = 0; i < str.length; i++) {
			System.out.println("분리된 문자열 " + i + ":" + str[i]);
		}
		
		//5부터시작
		a = a.substring(5);
		System.out.println(a);
	}
}

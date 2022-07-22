package Chapter03;

public class NumberFormatException {
	public static void main(String[] args) {
		
		String[] str = {"23", "12", "3.1415", "998"};
	
		int i = 0;
		
		for( i = 0; i < str.length; i++) {
			try {
				int j = Integer.parseInt(str[i]);
				System.out.println("숫자로 변환된 값은 " + j);
			} catch (Exception e) {
				System.out.println(str[i] + "는 정수로 변환불가");
			} 
		}

//		try {
//			for( i = 0; i < str.length; i++) {
//				int j = Integer.parseInt(str[i]);
//				System.out.println("숫자로 변환된 값은 " + j);
//			}
//		} catch (Exception e) {
//			System.out.println(str[i] + "는 정수로 변환불가");
//		} 
	}
}

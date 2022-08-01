package Chapter06;

public class AutoBoxingUnboxingEx {
	public static void main(String[] args) {
		
		int n = 10;
		Integer intObject = n;
//		Integer intObject = Integer.valueOf(n);
		System.out.println(intObject);
		
		int m = intObject + 10;
//		int m = intObject.intValue() + 10;
		System.out.println(m);
		
		
		
		
		
		
	}
}

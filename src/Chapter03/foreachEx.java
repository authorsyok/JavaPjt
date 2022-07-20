package Chapter03;

enum week {월,화,수,목,금,토,일}

public class foreachEx {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		String[] str = {"사과", "배", "바나나", "체리", "딸기", "포도"};
		int sum = 0;
		
		for (int k : arr) {
			System.out.print(k + " ");
			sum += k;
		}
		System.out.println(": " + sum);
		System.out.println("==============================");
		
		for (String s : str) {
			System.out.print(s + "   ");
		}
		System.out.println();
		System.out.println("==============================");
		
		for (week day : week.values()) {
			System.out.print(day + "요일  ");
		}
		System.out.println();
		System.out.println("==============================");
	}
}

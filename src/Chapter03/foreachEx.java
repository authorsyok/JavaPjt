package Chapter03;

enum week {��,ȭ,��,��,��,��,��}

public class foreachEx {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		String[] str = {"���", "��", "�ٳ���", "ü��", "����", "����"};
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
			System.out.print(day + "����  ");
		}
		System.out.println();
		System.out.println("==============================");
	}
}

package Chapter04;
import java.util.Scanner;
class Grade {
	
	public int math;
	public int science;
	public int english;
	
	public Grade(int m, int s, int e) {
		this.math = m;
		this.science = s;
		this.english = e;
	}

	public int average() {
		return (math + science + english) / 3;
	}
}

public class Average {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
		
		int math = sc.nextInt();
		int science = sc.nextInt();
		int english = sc.nextInt();
		
		Grade me = new Grade(math, science, english);
		System.out.println("평균은 " + me.average());
	}
}

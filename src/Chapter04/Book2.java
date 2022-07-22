package Chapter04;

public class Book2 {

	String title;
	String author;
	void show() {
		System.out.println(title + "@@@" + author);
	}	
	public Book2() {}
	public Book2(String title) {
		this(title, "작자미상");
	}	
	public Book2(String title, String author) {
		this.title = title;
		this.author = author;
	}	
	public static void main(String[] args) {
//		Book2 prince = new Book2();	//아무것도 없음. 매개변수가 없는 곳으로 이동(10줄)
		Book2 prince = new Book2("어린왕자", "생텍쥐페리");	//(14줄로이동)
		Book2 story = new Book2("춘향전");
		Book2 empty = new Book2();
		prince.show();
		story.show();
		empty.show();
		
	}
}

package Chapter04;

public class Book2 {

	String title;
	String author;
	void show() {
		System.out.println(title + "@@@" + author);
	}	
	public Book2() {}
	public Book2(String title) {
		this(title, "���ڹ̻�");
	}	
	public Book2(String title, String author) {
		this.title = title;
		this.author = author;
	}	
	public static void main(String[] args) {
//		Book2 prince = new Book2();	//�ƹ��͵� ����. �Ű������� ���� ������ �̵�(10��)
		Book2 prince = new Book2("�����", "�������丮");	//(14�ٷ��̵�)
		Book2 story = new Book2("������");
		Book2 empty = new Book2();
		prince.show();
		story.show();
		empty.show();
		
	}
}

package Chapter04;

public class Book {
	
	String title;
	String author;
	
	public Book(String t) {
		title = t; author = "���ڹ̻�";
	}
	
	public Book(String t, String a) {
		title = t; author = a;
	}
	
	public static void main(String[] args) {
		Book price = new Book("�����", "�������丮");
		Book lovestory = new Book("������");
		
		System.out.println(price.title + " " + price.author);
		System.out.println(lovestory.title + " " + lovestory.author);
	}
}

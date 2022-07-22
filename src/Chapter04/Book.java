package Chapter04;

public class Book {
	
	String title;
	String author;
	
	public Book(String t) {
		title = t; author = "작자미상";
	}
	
	public Book(String t, String a) {
		title = t; author = a;
	}
	
	public static void main(String[] args) {
		Book price = new Book("어린왕자", "생텍쥐페리");
		Book lovestory = new Book("춘향전");
		
		System.out.println(price.title + " " + price.author);
		System.out.println(lovestory.title + " " + lovestory.author);
	}
}

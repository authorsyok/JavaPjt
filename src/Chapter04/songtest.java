package Chapter04;

class Song {
	
	public String title;
	public String artist;
	public int year;
	public String country;

//	Song() {};
//	
//	public void show() {
//		System.out.println(year + "�� " + country +"������ " + artist + "�� �θ� " + title);
//	}
	
	public Song(int y, String c, String a, String t) {
		this.year = y;
		this.country = c;
		this.artist = a;
		this.title = t;
	}
	
	public String show() {
		return year + "�� " + country + "������ " + artist + "�� �θ� " + title;
	}
}

public class songtest {
	public static void main(String[] args) {
		
//		Song song = new Song();
//		song.title = "Dancing Queen";
//		song.artist = "ABBA";
//		song.year = 1978;
//		song.country = "������";
//		
//		song.show();
		
		Song song = new Song(1978, "������", "ABBA", "Dancing Queen");
		System.out.println(song.show());
	}
}

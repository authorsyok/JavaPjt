package Chapter03;

enum devtype {
	mobile, web, server
}

public class Developer {
	
	public String name;
	public int career;
	public devtype type;
	
	public static void main(String[] args) {
		Developer developer = new Developer();
		developer.name = "�浿";
		developer.career = 3;
		developer.type = devtype.web;
		
		System.out.println("������ �̸� : " + developer.name);
		System.out.println("������ ��� : " + developer.career);
		System.out.println("������Ʈ : " + developer.type);
	}
}



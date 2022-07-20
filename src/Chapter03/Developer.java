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
		developer.name = "길동";
		developer.career = 3;
		developer.type = devtype.web;
		
		System.out.println("개발자 이름 : " + developer.name);
		System.out.println("개발자 경력 : " + developer.career);
		System.out.println("직무파트 : " + developer.type);
	}
}



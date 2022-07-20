package Chapter03;

enum devtype {
	mobile, web, server
}

public class Developer {
	
	public String name;
	public int career;
	public devtype type;
	
	public static void main(String[] args) {
		// enum 클래스 사용하기
		Developer developer = new Developer();
		developer.name = "홍길동";
		developer.career = 3;
		developer.type = devtype.web;
				
		System.out.println("개발자 이름 : " + developer.name);
		System.out.println("개발자 경력 : " + developer.career);
		System.out.println("직무파트 : " + developer.type);
		System.out.println("==============================");
		
		// values() : 열거된 모든 원소를 배열에 담아 순서대로 리턴
		for(devtype type : devtype.values()) {
			System.out.println(type);
		}
		System.out.println("==============================");
		
		// ordinal() : 원소에 열거된 순서를 정수 값으로 리턴
		System.out.println(developer.type.ordinal());	//web의 위치
		devtype dt = developer.type.server;
		System.out.println(dt.ordinal());				//server의 위치
		System.out.println("==============================");
		
		// valueOf() : 매개변수로 주어진 String과 열거형에서 일치하는 이름을 갖는 원소를 리턴
		devtype dt1 = devtype.mobile;					//enum형 객체를 만들어서 가져오기
		devtype dt2 = devtype.valueOf("web");			//valueOf() 메소드를 이용해 가져오기
		System.out.println(dt1);
		System.out.println(dt2);
		System.out.println("==============================");

		
	
		
	}
}



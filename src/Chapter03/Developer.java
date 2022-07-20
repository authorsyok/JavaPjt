package Chapter03;

enum devtype {
	mobile, web, server
}

public class Developer {
	
	public String name;
	public int career;
	public devtype type;
	
	public static void main(String[] args) {
		// enum Ŭ���� ����ϱ�
		Developer developer = new Developer();
		developer.name = "ȫ�浿";
		developer.career = 3;
		developer.type = devtype.web;
				
		System.out.println("������ �̸� : " + developer.name);
		System.out.println("������ ��� : " + developer.career);
		System.out.println("������Ʈ : " + developer.type);
		System.out.println("==============================");
		
		// values() : ���ŵ� ��� ���Ҹ� �迭�� ��� ������� ����
		for(devtype type : devtype.values()) {
			System.out.println(type);
		}
		System.out.println("==============================");
		
		// ordinal() : ���ҿ� ���ŵ� ������ ���� ������ ����
		System.out.println(developer.type.ordinal());	//web�� ��ġ
		devtype dt = developer.type.server;
		System.out.println(dt.ordinal());				//server�� ��ġ
		System.out.println("==============================");
		
		// valueOf() : �Ű������� �־��� String�� ���������� ��ġ�ϴ� �̸��� ���� ���Ҹ� ����
		devtype dt1 = devtype.mobile;					//enum�� ��ü�� ���� ��������
		devtype dt2 = devtype.valueOf("web");			//valueOf() �޼ҵ带 �̿��� ��������
		System.out.println(dt1);
		System.out.println(dt2);
		System.out.println("==============================");

		
	
		
	}
}



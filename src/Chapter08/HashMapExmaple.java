package Chapter08;

import java.util.HashMap;
import java.util.Map;

public class HashMapExmaple {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("�ӿ���", 31);
		map.put("�ӿ�", 41);
		map.put("��", 51);
		System.out.println("��  �� : " + map.size());
		System.out.println("�ӿ���  : " + map.get("�ӿ���"));
	}
}

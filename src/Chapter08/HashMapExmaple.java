package Chapter08;

import java.util.HashMap;
import java.util.Map;

public class HashMapExmaple {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("юс©╣©У", 31);
		map.put("юс©╣", 41);
		map.put("юс", 51);
		System.out.println("ця  ╪Ж : " + map.size());
		System.out.println("юс©╣©У  : " + map.get("юс©╣©У"));
	}
}

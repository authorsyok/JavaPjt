package Chapter08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("JAVA");
		set.add("JAV");
		set.add("JAaaa");
		set.add("JA");
	
		int size = set.size();
		System.out.println("√— ∞¥√ººˆ :" + size);
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t"+element);
		}
		System.out.println();
	
		set.remove("JAV");
		System.out.println("√— ∞¥√ººˆ :" + set.size());
//
//		Iterator<String> iterator2 = set.iterator();
//		while(iterator2.hasNext()) {
//			String element = iterator2.next();
//			System.out.println("\t"+element);
//		}
		for(String string : set) {
			System.out.println("\t" + string);
		}
		
		if(set.isEmpty()) System.out.println("∫ÒæÓ¿÷¿Ω");
		else System.out.println("∞¥√º ¿÷¿Ω");
		
		set.clear();
		if(set.isEmpty()) System.out.println("∫ÒæÓ¿÷¿Ω");
		else System.out.println("∞¥√º ¿÷¿Ω");
	}
}

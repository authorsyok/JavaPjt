package Chapter07;

import java.util.*;
import java.io.*;

public class ArrayCopy {    
	public static void main(String[] args) {         
		// 1. 합칠 배열 2개 준비       
		Integer[] arr1 = { 1, 2, 3 };        
		Integer[] arr2 = { 4, 5 };         
		// 2. 배열을 List로 변환        
		List<Integer> list1 = new ArrayList(Arrays.asList(arr1));        
		List<Integer> list2 = new ArrayList(Arrays.asList(arr2));         
		// 3. 두 List 합치기        
		list1.addAll(list2);         
		// 4. list1을 배열로 변환        
		Integer[] dest = list1.toArray(new Integer[0]);         
		// 5. 결과 출력        
		System.out.println(Arrays.toString(dest)); // [1, 2, 3, 4, 5]    
		
	}
}

package Chapter07;

import java.util.*;
import java.io.*;

public class ArrayCopy {    
	public static void main(String[] args) {         
		// 1. ��ĥ �迭 2�� �غ�       
		Integer[] arr1 = { 1, 2, 3 };        
		Integer[] arr2 = { 4, 5 };         
		// 2. �迭�� List�� ��ȯ        
		List<Integer> list1 = new ArrayList(Arrays.asList(arr1));        
		List<Integer> list2 = new ArrayList(Arrays.asList(arr2));         
		// 3. �� List ��ġ��        
		list1.addAll(list2);         
		// 4. list1�� �迭�� ��ȯ        
		Integer[] dest = list1.toArray(new Integer[0]);         
		// 5. ��� ���        
		System.out.println(Arrays.toString(dest)); // [1, 2, 3, 4, 5]    
		
	}
}

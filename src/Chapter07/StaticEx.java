package Chapter07;

class ArrayUtil {

	public static int[] concat(int[] a, int[] b) {
		int[] temp = new int[a.length + b.length];
		for(int i = 0; i < a.length; i++) {
			temp[i] = a[i];
		}
		for(int i = 0; i < b.length; i++) {
			int index = a.length + i;
			temp[index] = b[i];
		}
		return temp;
	}

	public static void print(int[] a) {
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}

public class StaticEx {
	public static void main(String[] args) {
		int[] arr1 = {1,5,7,9};
		int[] arr2 = {3,6,-1,100,77};

		int[] arr3 = ArrayUtil.concat(arr1, arr2);
		ArrayUtil.print(arr3);
 	}
}

package programmers_level0;

import java.util.Arrays;

public class _a61_7ÀÇ°³¼ö {
	public static void main(String[] arg) {
		// int[] arr2 = { 4, 455, 6, 4, -1, 45, 6 };
		 int[] arr1 = { 7, 77, 17 };
		// String str = "hello";
		// String[] sarr = { "a", "b", "c" };
		System.out.println((solution(arr1)));
	}

	public static int solution(int[] array) {
        String str = Arrays.toString(array).replaceAll("[^7]","");;
        return str.length();
        
        
    }
}
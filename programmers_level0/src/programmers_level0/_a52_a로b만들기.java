package programmers_level0;

import java.util.Arrays;

public class _a52_a��b����� {
	public static void main(String[] arg) {
		// int[] arr2 = { 4, 455, 6, 4, -1, 45, 6 };
		//int[] arr3 = { 1, 2, 3, 4, 5, 6, 7, 8 };
		// String str = "hello";
		// String[] sarr = { "a", "b", "c" };
		System.out.println((solution("olleh", "hello")));
		System.out.println((solution("allpe", "apple")));
	}

	public static int solution(String before, String after) {
	       String[] b_arr = before.split("");
			String[] a_arr = after.split("");
			Arrays.sort(b_arr);
			Arrays.sort(a_arr);


			return String.join("", b_arr).equals(String.join("", a_arr)) ? 1 : 0;
	    }
	}
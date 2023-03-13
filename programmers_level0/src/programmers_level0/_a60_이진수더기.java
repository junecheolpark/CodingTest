package programmers_level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _a60_이진수더기 {
	public static void main(String[] arg) {
		// int[] arr2 = { 4, 455, 6, 4, -1, 45, 6 };
		// int[] arr1 = { 3, 76, 24 };
		// int[] arr2 = { 1, 2, 3, 4, 5, 6, 7 };
		// int[] arr3 = { 30, 10, 23, 6, 100 };
		// String str = "hello";
		// String[] sarr = { "a", "b", "c" };
		System.out.println((solution("11","10")));
		System.out.println((solution("1001","1111")));
	}

	public static String solution(String bin1, String bin2) {
		String answer = "";
        int num1 = Integer.parseInt(bin1, 2);
        int num2 = Integer.parseInt(bin2, 2);
        int res = num1+num2;
        answer = Integer.toBinaryString(res);
        return answer;
	}
}
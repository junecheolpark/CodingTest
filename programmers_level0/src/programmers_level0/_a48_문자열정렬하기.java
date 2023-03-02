package programmers_level0;

import java.util.*;

public class _a48_문자열정렬하기 {
	public static void main(String[] arg) {
		// int[] arr2 = { 4, 455, 6, 4, -1, 45, 6 };
		// int[] arr3 = { 1, 2, 3 };
		// String str = "hello";
		// String[] sarr = { "a", "b", "c" };
		System.out.println((solution("Bcad")));
		System.out.println((solution("heLLo")));
	}

	public static String solution(String my_string) {
		String answer = "";
        char[] chars = my_string.toLowerCase().toCharArray();
        Arrays.sort(chars);
        answer = new String(chars);
  
        return answer;
    }
}
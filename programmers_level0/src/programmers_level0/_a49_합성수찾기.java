package programmers_level0;

import java.util.*;

public class _a49_합성수찾기 {
	public static void main(String[] arg) {
		// int[] arr2 = { 4, 455, 6, 4, -1, 45, 6 };
		// int[] arr3 = { 1, 2, 3 };
		// String str = "hello";
		// String[] sarr = { "a", "b", "c" };
		System.out.println((solution(10)));
		System.out.println((solution(15)));
	}

	public static int solution(int n) {
	       int answerCount = 0;
	        for (int i = 4; i <= n; i++) {
	            if (isValue(i)) answerCount++;
	        }
	        return answerCount;
	    }

	    public static boolean isValue(int number) {
	        int count = 0;
	        for (int i = 1; i <= Math.sqrt(number) ; i++) {
	            if (number % i == 0) count++;
	        }
	        return count >= 2;
	    }
	    
	}
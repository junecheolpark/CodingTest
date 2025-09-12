package programmers_level0;

import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/181901?language=java

public class _a68_배열만들기1 {
	public static void main(String[] arg) {
		System.out.println(Arrays.toString(solution(10,3)));
	}

	public static int[] solution(int n, int k) {
		int size = n / k;
		int[] arr = new int[size];
		
		for (int i = 0; i < size; i++) {
			arr[i] = k * (i + 1);
		}
		
		return arr;
	}
}
package programmers_level0;

import java.util.Arrays;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181924
 * */

public class _b152_수열과구간쿼리3 {
	public static void main(String[] arg) {
		int[] arr1 = { 0, 1, 2, 3, 4 };
		int[][] arr2 = { { 0, 3 }, { 1, 2 }, { 1, 4 } };
		System.out.println((Arrays.toString(solution(arr1, arr2))));
	}

	public static int[] solution(int[] arr, int[][] queries) {
		int sNum = 0, eNum = 0, tradNum = 0;
		for (int i = 0; i < queries.length; i++) {
			// arr배열을 저장후 i와j 순서바꿈
			sNum = queries[i][0];
			eNum = queries[i][1];
			tradNum = arr[eNum];
			arr[eNum] = arr[sNum];
			arr[sNum] = tradNum;
		}
		return arr;
	}

}
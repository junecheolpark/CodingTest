package programmers_level2;

import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/12941

public class a00_최대값과최소값 {
	public static void main(String[] args) {
		int[] arr = { 1, 4, 2 };
		int[] arr2 = { 5, 4, 4 };
		System.out.println(solution(arr, arr2));
	}

	public static int solution(int[] A, int[] B) {
		int answer = 0;
		int length = A.length - 1;
		Arrays.sort(A);
		Arrays.sort(B);
		for (int i = 0; i <= length; i++) {
			answer += (A[i] * B[length - i]);
		}
		return answer;
	}

}

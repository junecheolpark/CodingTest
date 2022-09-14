import java.util.Arrays;
import java.util.Scanner;

public class a17_제일작은수제거하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 4, 3, 2, 1 };
		int[] answer = new Solution17().solution(arr);
		System.out.println(Arrays.toString(answer));

	}
}

class Solution17 {
	public int[] solution(int[] arr) {
		/*
		 * / int[] answer = {-1}; Arrays.sort(arr); if (arr.length > 1) { answer = new
		 * int[arr.length - 1]; // 3 for (int i = answer.length - 1; i >= 0; i--) { //
		 * 2~0까지 3번반복 answer[i] = arr[i + 1]; // 거꾸로 정렬 } } return answer; /
		 **/

		/**/

		if (arr.length <= 1) {// 배열 길이가 1이하인경우 -1 반환
			int[] answer = { -1 };
			return answer;
		}

		// 배열길이가 1보다 클경우
		int[] answer = new int[arr.length - 1];

		int min = arr[0]; // 하나의 값을 기준으로 잡음.

		for (int i = 0; i < arr.length; i++) {// 가장 작은 수 구하기
			min = Math.min(min, arr[i]);
			System.out.println(min);
		}

		int cnt = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != min) { // cnt++을 사용해 순차적으로 정의
				answer[cnt++] = arr[i];
			}
		}

		return answer;
		/**/

	}
}

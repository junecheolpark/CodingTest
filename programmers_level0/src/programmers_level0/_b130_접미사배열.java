package programmers_level0;

import java.util.Arrays;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181892
 * */

public class _b130_접미사배열 {
	public static void main(String[] arg) {
		int[] arr = { 5, 2, 1, 7, 5 };
		System.out.println(Arrays.toString(solution(arr, 2)));
	}

	// 방법1
	public static int[] solution(int[] num_list, int n) {
		int[] answer = new int[num_list.length - n + 1];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = num_list[i + n -1];
			
		}
		return answer;
	}
	
	// 방법2 이방법이 더욱 효율적 성능차이거의없음 o(N)방식
	public static int[] solution2(int[] num_list, int n) {
		return Arrays.copyOfRange(num_list, n - 1, num_list.length);
	}

}
package programmers_level0;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181929
 * */

public class _b124_원소들의곱과합 {
	public static void main(String[] arg) {
		int[] arr = { 3, 4, 5, 2, 1 };
		System.out.println(solution(arr));
	}

	// 방법1
	public static int solution(int[] num_list) {
		int square = 1;
		int sum = 0;
		for (int num : num_list) {
			square *= num;
			sum += num;
		}
		return square < (sum *= sum) ? 1 : 0;
	}

}
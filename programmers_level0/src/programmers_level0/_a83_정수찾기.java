package programmers_level0;
/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181840
 * */

public class _a83_정수찾기 {
	public static void main(String[] arg) {
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(solution(arr, 3));
	}

	public static int solution(int[] num_list, int n) {
		for (int num : num_list) {
			if (num == n) {
				return 1;
			}
		}
		return 0;
	}
}
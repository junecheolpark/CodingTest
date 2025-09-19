package programmers_level0;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181879
 * */

public class _b109_가까운1찾기 {
	public static void main(String[] arg) {
		int[] arr = { 0, 0, 0, 1 };
		int[] arr2 = { 1, 1, 1, 1, 0 };
		//System.out.println(solution(arr, 1));
		System.out.println(solution(arr2, 3));
	}

	public static int solution(int[] arr, int idx) {
		for (int i = idx; i < arr.length; i++) {
			if (arr[i] == 1) return i;
		}
		return -1;
	}

}
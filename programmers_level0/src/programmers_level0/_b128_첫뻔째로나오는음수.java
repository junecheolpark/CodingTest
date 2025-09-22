package programmers_level0;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181896
 * */

public class _b128_첫뻔째로나오는음수 {
	public static void main(String[] arg) {
		int[] arr = { 12, 4, 15, 46, 38, -2, 15 };
		System.out.println((solution(arr)));
	}

	// 방법1
	public static int solution(int[] num_list) {
		for (int i = 0; i < num_list.length; i++) {
			if (num_list[i] < 0) {
				return i;
			}
		}
		return -1;
	}

}
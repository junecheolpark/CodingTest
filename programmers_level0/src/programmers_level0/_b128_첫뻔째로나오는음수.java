package programmers_level0;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181896
 * */

public class _b128_ù��°�γ��������� {
	public static void main(String[] arg) {
		int[] arr = { 12, 4, 15, 46, 38, -2, 15 };
		System.out.println((solution(arr)));
	}

	// ���1
	public static int solution(int[] num_list) {
		for (int i = 0; i < num_list.length; i++) {
			if (num_list[i] < 0) {
				return i;
			}
		}
		return -1;
	}

}
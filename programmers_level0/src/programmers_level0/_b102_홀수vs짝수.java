package programmers_level0;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181887
 * */

public class _b102_È¦¼övsÂ¦¼ö {
	public static void main(String[] arg) {
		int[] arr = {4, 2, 6, 1, 7, 6};
		System.out.println(solution(arr));
	}

	public static int solution(int[] num_list) {
		int num1 = 0;
		int num2 = 0;
		for (int i = 0; i < num_list.length; i++) {
			if (i % 2 == 0) {
				num1 += num_list[i];
			} else {
				num2 += num_list[i];
			}
		}

		return num1 > num2 ? num1 : num2;
		// return Math.max(num1, num2);
	}

}
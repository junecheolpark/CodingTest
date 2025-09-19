package programmers_level0;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181879
 * */

public class _b112_길이에따른연산 {
	public static void main(String[] arg) {
		int[] arr = { 3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1 };
		int[] arr2 = { 2, 3, 4, 5 };
		System.out.println(solution(arr));
		System.out.println(solution(arr2));
	}

	public static int solution(int[] num_list) {
		int answer = num_list.length >= 11 ? 0 : 1;
		
		for (int i = 0; i < num_list.length; i++) {
			if (num_list.length >= 11) {
				answer += num_list[i];
			} else {
				answer *= num_list[i];
			}
		}
		return answer;
	}

}
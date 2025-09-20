package programmers_level0;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181884
 * */

public class _b116_n보다커질때까지더하기 {
	public static void main(String[] arg) {
		int[] arr = { 34, 5, 71, 29, 100, 34 };
		System.out.println(solution(arr, 123));
	}

	public static int solution(int[] numbers, int n) {
		int answer = 0;
		for (int num : numbers) {
			answer += num;
			if (answer > n)
				break;
		}
		return answer;
	}

}
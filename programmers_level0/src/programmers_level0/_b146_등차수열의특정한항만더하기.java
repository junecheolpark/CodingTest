package programmers_level0;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181931
 * */

public class _b146_등차수열의특정한항만더하기 {
	public static void main(String[] arg) {
		boolean[] arr = { true, false, false, true, true };
		System.out.println(((solution(3, 4, arr))));
	}

	public static int solution(int a, int d, boolean[] included) {
		int answer = 0;
		for (int i = 0; i < included.length; i++) {
			if (included[i]) {
				answer += a + (i * d);
			}
		}
		return answer;
	}
}
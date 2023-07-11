import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/135808

public class a51_과일장수 {
	public static void main(String[] arg) {
		int[] arr = { 4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2 };
		int[] arr2 = { 1, 2, 3, 1, 2, 3, 1 };
		System.out.println(solution(4, 3, arr));
	}

	public static int solution(int k, int m, int[] score) {
		int answer = 0;
		Arrays.sort(score);
		for (int i = score.length - 1; i > 0; i -= m) {
			if (i >= m - 1) {
				answer += (score[i - m + 1] * m);
			}
		}
		return answer;
	}
}

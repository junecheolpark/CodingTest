package programmers_level0;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181829
 * */

public class _b138_이차원배열대각선순회하기 {
	public static void main(String[] arg) {
		int[][] arr = { { 0, 1, 2 }, { 1, 2, 3 }, { 2, 3, 4 }, { 3, 4, 5 } };
		System.out.println((solution(arr, 2)));
	}

	public static int solution(int[][] board, int k) {
		int sum = 0;

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (i + j <= k) {
					sum += board[i][j];
				}
			}
		}

		return sum;
	}

}
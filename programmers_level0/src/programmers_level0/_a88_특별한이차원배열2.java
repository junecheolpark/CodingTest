package programmers_level0;
/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181831
 * */

public class _a88_특별한이차원배열2 {
	public static void main(String[] arg) {
		int[][] arr = { { 5, 192, 33 }, { 192, 72, 95 }, { 33, 95, 999 } };
		System.out.println(solution(arr));
	}

	public static int solution(int[][] arr) {
		for (int i = 0; i < arr[0].length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] != arr[j][i]) {
					return 0;
				}
			}
        }
        return 1;
    }

}
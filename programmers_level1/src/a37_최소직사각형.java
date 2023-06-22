// https://school.programmers.co.kr/learn/courses/30/lessons/86491
public class a37_최소직사각형 {
	public static void main(String[] arg) {
		int[][] n = { { 60, 50 }, { 30, 70 }, { 60, 30 }, { 80, 40 } };
		int[][] n2 = { { 10, 7 }, { 12, 3 }, { 8, 15 }, { 14, 7 }, { 5, 15 } };

		int answer = new Solution37().solution(n);
		int answer2 = new Solution37().solution(n2);
		System.out.println(answer);
		System.out.println(answer2);
	}
}

class Solution37 {

	public int solution(int[][] sizes) {
		int answer = 0, maxHeight = 0, maxWidth = 0;

		for (int i = 0; i < sizes.length; i++) {
			int length = sizes[i][0];
			int width = sizes[i][1];

			// 현재 사각형의 가로와 세로 중에서 더 긴 값을 찾음
			int maxSide = Math.max(length, width);

			// 가로와 세로 중에서 더 긴 값과 이전에 값 중에서 더 큰 값을 비교하여 갱신
			maxHeight = Math.max(maxHeight, Math.min(length, width));
			maxWidth = Math.max(maxWidth, maxSide);
		}

		// 가장 큰 사각형의 넓이 계산
		answer = maxHeight * maxWidth;
		return answer;
	}

}

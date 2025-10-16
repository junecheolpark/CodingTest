package programmers_level0;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/120860
 * */

public class _b191_직사각형넓이구하기 {
	public static void main(String[] arg) {
		System.out.println((solution(new int[][] { { 1, 1 }, { 2, 1 }, { 2, 2 }, { 1, 2 } })));
	}

	public static int solution(int[][] dots) {
		int minX = dots[0][0];
		int maxX = dots[0][0];
		int minY = dots[0][1];
		int maxY = dots[0][1];

		for (int i = 1; i < dots.length; i++) {
			minX = Math.min(minX, dots[i][0]);
			maxX = Math.max(maxX, dots[i][0]);
			minY = Math.min(minY, dots[i][1]);
			maxY = Math.max(maxY, dots[i][1]);
		}

		int width = maxX - minX;
		int height = maxY - minY;

		return width * height;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/86491
public class a37_�ּ����簢�� {
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

			// ���� �簢���� ���ο� ���� �߿��� �� �� ���� ã��
			int maxSide = Math.max(length, width);

			// ���ο� ���� �߿��� �� �� ���� ������ �� �߿��� �� ū ���� ���Ͽ� ����
			maxHeight = Math.max(maxHeight, Math.min(length, width));
			maxWidth = Math.max(maxWidth, maxSide);
		}

		// ���� ū �簢���� ���� ���
		answer = maxHeight * maxWidth;
		return answer;
	}

}

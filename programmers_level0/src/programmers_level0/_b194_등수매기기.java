package programmers_level0;

import java.util.Arrays;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/120882
 * */

public class _b194_����ű�� {
	public static void main(String[] arg) {
		System.out.println(Arrays.toString(solution(new int[][] { { 80, 70 }, { 90, 50 }, { 40, 70 }, { 50, 80 } })));

	}

	public static int[] solution(int[][] score) {
		int length = score.length;
		int num = 0;
		double[] avg = new double[length];
		int[] lank = new int[length];
		// ��հ� ���ϱ�
		for (int i = 0; i < length; i++) {
			// 2�� ������ �Ҽ������� ������
			avg[i] = (score[i][0] + score[i][1]) / 2.0;
		}

		// ����ű��
		for (int i = 0; i < length; i++) {
			num = 1;
			for (int j = 0; j < length; j++) {
				if (avg[i] < avg[j]) {
					num++;
				}
			}
			lank[i] = num;
		}
		return lank;
	}
}

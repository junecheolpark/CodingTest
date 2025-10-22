package programmers_level0;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/120878
 * */

public class _b200_���ѼҼ��Ǻ��ϱ� {
	public static void main(String[] arg) {
		System.out.println((solution(7, 20)));

	}

	private static int solution(int a, int b) {
		// 1. �ִ������� ���
		int gcd = gcd(a, b);
		b /= gcd;

		// 2. �и𿡼� 2�� 5 ����
		while (b % 2 == 0) {
			b /= 2;
		}
		while (b % 5 == 0) {
			b /= 5;
		}

		// 3. ���� �и� Ȯ��
		return (b == 1) ? 1 : 2;
	}

	// �ִ����� �Լ� (��Ŭ���� ȣ����)
	private static int gcd(int x, int y) {
		while (y != 0) {
			int temp = x % y;
			x = y;
			y = temp;
		}
		return x;
	}
}

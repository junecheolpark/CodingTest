package programmers_level0;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/120884
 * */

public class _b192_ġŲ���� {
	public static void main(String[] arg) {
		System.out.println((solution(100)));

	}

	public static int solution(int chicken) {
		int answer = 0;
		int coupon = chicken;

		while (coupon >= 10) {
			int service = coupon / 10; // ���� ġŲ ��
			int rest = coupon % 10; // ���� ���� ��

			answer += service;
			coupon = service + rest; // ���� ���� ���� + ���� ����
		}

		return answer;
	}
}

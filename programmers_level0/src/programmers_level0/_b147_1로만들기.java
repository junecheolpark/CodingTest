package programmers_level0;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181880
 * */

public class _b147_1�θ���� {
	public static void main(String[] arg) {
		int[] arr = { 12, 4, 15, 1, 14 };
		System.out.println((solution(arr)));
	}

	public static int solution(int[] num_list) {
		int answer = 0, cnt = 0, num = 0;

		for (int i = 0; i < num_list.length; i++) {
			cnt = 0; // ��� ��������
			num = num_list[i];
			while (num > 1) {// ¦���� ������2
				if (num % 2 == 0) {
					num /= 2;
				} else { // Ȧ����� -1 -> ������ 2
					num = (num - 1) / 2;
				}
				cnt++;
			}
			answer += cnt;
		}
		return answer;
	}
}
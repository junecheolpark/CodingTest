package programmers_level2;

import java.util.HashSet;
import java.util.Set;

//https://school.programmers.co.kr/learn/courses/30/lessons/131701
public class a15_���Ӻκм������ǰ��� {
	public static void main(String[] args) {

		int[] elements = { 7, 9, 1, 1, 4 };
		System.out.println(solution(elements)); // ���:18
	}

	// ��� 1
	public static int solution(int[] elements) {
		Set<Integer> set = new HashSet<>();
		int eLength = elements.length;
		int cnt = 0;

		// �հ踦 ����ϰ� Set�� �߰�
		for (int i = 0; i < eLength; i++) {
			for (int j = 0; j < eLength; j++) {
				int sum = 0; // �� �κ��� �� �������� �ʱ�ȭ
				for (int s = j; s <= j + cnt; s++) {
					sum += elements[s % eLength];
				}
				set.add(sum);
			}
			cnt++;
		}

		return set.size();
	}

	// ��� 2
	public static int solution2(int[] elements) {
		int eLength = elements.length;

		// �ߺ����� ���� �հ踦 �����ϱ� ���� Set
		Set<Integer> set = new HashSet<>();

		// ��� ���� �κ� ������ ���� ����Ͽ� Set�� �߰�
		for (int start = 0; start < eLength; start++) {
			int sum = 0;
			// start���� �����ϴ� ��� ������ �κ� ���� �˻�
			for (int length = 1; length <= eLength; length++) {
				sum += elements[(start + length - 1) % eLength];
				set.add(sum);
			}
		}

		// ������ ���� ������ ��ȯ
		return set.size();
	}

}

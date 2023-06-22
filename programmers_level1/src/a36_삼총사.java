// https://school.programmers.co.kr/learn/courses/30/lessons/131705
public class a36_���ѻ� {
	public static void main(String[] arg) {
		int[] n = {-2, 3, 0, 2, -5};

		int answer = new Solution36().solution(n);
		System.out.println(answer);
	}
}

class Solution36 {
	private int count = 0;

	public int solution(int[] number) {
		backtrack(0, 0, number, 0);
		return count;
	}

	private void backtrack(int currSum, int selected, int[] numbers, int idx) {
		if (selected == 3) { // �� �л��� �������� ��
			if (currSum == 0) { // ���� 0�̸� ���ѻ��� ������� ����
				count++;
			}
			return;
		}

		if (idx >= numbers.length) {
			return;
		}

		// ���� �л� ����
		backtrack(currSum + numbers[idx], selected + 1, numbers, idx + 1);

		// ���� �л� �������� ����
		backtrack(currSum, selected, numbers, idx + 1);
	}
}

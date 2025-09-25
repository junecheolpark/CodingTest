package programmers_level0;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181871
 * */

public class _b150_���ڿ��̸�������ϴ������� {
	public static void main(String[] arg) {
		System.out.println((solution("banana", "ana")));
		System.out.println((solution("aaaa", "aa")));
	}
	// ��� 1 i�ڷ� �߶��ص� pat�� ã��
	public static int solution(String myString, String pat) {
		int cnt = 0;

		for (int i = 0; i < myString.length(); i++) {
			if (myString.substring(i).startsWith(pat))
				cnt++;
		}
		return cnt;
	}

	// ��� 2 indexof�� �ش� idx���� ����ã��
	public static int solution2(String myString, String pat) {
		int cnt = 0;
		int idx = 0;

		while (true) {
			// index ��ġ���� pat�� ã��
			idx = myString.indexOf(pat, idx);
			if (idx == -1)
				break; // �� �̻� ����
			cnt++;
			idx++; // ��ĥ �� �����Ƿ� 1�� �̵�
		}

		return cnt;
	}

}
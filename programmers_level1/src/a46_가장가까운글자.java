//https://school.programmers.co.kr/learn/courses/30/lessons/142086

public class a46_���尡������ {
	public static void main(String[] arg) {
		int[] Array = solution("banana");
		for (int i = 0; i < Array.length; i++) {
			System.out.println(Array[i]);
		}

	}

	public static int[] solution(String s) {
		int[] answer = new int[s.length()];
		char[] ch = s.toCharArray(); // ���� �迭�� ����

		for (int i = 0; i < ch.length; i++) {
			int cnt = 0;
			for (int j = i; j > 0; j--) { // ���� ���ڿ��� �迭[0]���� ��ȸ�� ������ -1 ������ ������ ���� ��ŭ ���� 
				cnt++;
				if (ch[i] == ch[j - 1]) {
					break;
				} else if (j - 1 == 0) {
					cnt = 0;
				}
			}
			answer[i] = (cnt == 0 ? -1 : cnt);
		}
		return answer;
	}
}

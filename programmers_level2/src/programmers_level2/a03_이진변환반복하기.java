package programmers_level2;

import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/70129
public class a03_������ȯ�ݺ��ϱ� {
	public static void main(String[] args) {

		System.out.println(Arrays.toString(solution("110010101001")));
		System.out.println(Arrays.toString(solution("01110")));
		System.out.println(Arrays.toString(solution("1111111")));
	}

	public static int[] solution(String s) {
		int[] answer = {1,0};
		int sLength = 0;

		answer[1] += zeroRemove(s);
		sLength = s.replaceAll("0", "").length();
		String oneStr = Integer.toBinaryString(sLength); // 1���̰� 2������ ��ȯ

		while (sLength > 1) { // ���ڿ��� ���̰��� 1�϶����� �ݺ�
			answer[1] += zeroRemove(oneStr);
			oneStr = Integer.toBinaryString((oneStr.replaceAll("0", "").length()));
			sLength = oneStr.length();
			answer[0]++;
		}
		return answer;
	}

	public static int zeroRemove(String str) { // 0 ���� Ȯ���ؼ� ����
		int cnt = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '0') {
				cnt++;
			}
		}
		return cnt;
	}

}

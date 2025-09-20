package programmers_level0;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181874
 * */

public class _b118_A�����ϱ� {
	public static void main(String[] arg) {
		System.out.println(solution("abstract algebra"));
	}

	//���1 ������ �� �������� ���ɼ��� �ְų� �Է��� Ŭ���
	public static String solution(String myString) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < myString.length(); i++) {
			if (myString.charAt(i) == 'a') {
				sb.append('A');
			} else if (myString.charAt(i) != 'A') {
				sb.append(Character.toLowerCase(myString.charAt(i)));
			}
		}
		return sb.toString();
	}

	// ���2 �ܼ��ϰ� �Է��� ª�����
	public static String solution2(String myString) {
		myString = myString.toLowerCase();
		myString = myString.replace('a', 'A');

		return myString;
	}

}
package programmers_level0;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181905
 * */

public class _b148_���ڿ������� {
	public static void main(String[] arg) {
		System.out.println((solution("Progra21Sremm3", 6, 12)));
	}

	// ���1 ������
	public static String solution(String my_string, int s, int e) {
		String frontStr = my_string.substring(0, s);
		String turnStr = new StringBuilder(my_string.substring(s, e + 1)).reverse().toString();
		String backStr = my_string.substring(e + 1);
		return frontStr + turnStr + backStr;
	}

	// ���2 ����
	public static String solution2(String my_string, int s, int e) {
		char[] arr = my_string.toCharArray();
		while (s < e) {
			char temp = arr[s];
			arr[s++] = arr[e];
			arr[e--] = temp;
		}

		return new String(arr);
	}
}
package programmers_level0;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181940
 * */

public class _b132_���ڿ����ϱ� {
	public static void main(String[] arg) {
		System.out.println((solution("string", 3)));
	}

	/*
	 * Java 11 �̻��̸� repeat() ��� ��õ 
	 * Java 8 ���� �� StringBuilder �ݺ��� ���
	 */
	public static String solution(String my_string, int k) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < k; i++) {
			sb.append(my_string);
		}
		return sb.toString();
		//return my_string.repeat(k);
	}

}
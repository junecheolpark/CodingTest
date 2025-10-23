package programmers_level0;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181932
 * */

public class _b203_�ڵ�ó���ϱ� {
	public static void main(String[] arg) {
		System.out.println((solution("abc1abc1abc")));

	}

	private static String solution(String code) {
	        StringBuilder ret = new StringBuilder();
	        int mode = 0;

	        for (int i = 0; i < code.length(); i++) {
	            char c = code.charAt(i);

	            if (c == '1') {
	                // mode ��ȯ
	                mode = (mode == 0) ? 1 : 0;
	            } else {
	                // mode�� ���� ���� �߰� ���� ����
	                if (mode == 0 && i % 2 == 0) {
	                    ret.append(c);
	                } else if (mode == 1 && i % 2 == 1) {
	                    ret.append(c);
	                }
	            }
	        }

	        return ret.length() == 0 ? "EMPTY" : ret.toString();
    }
	
}

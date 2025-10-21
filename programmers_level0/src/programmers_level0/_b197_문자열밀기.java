package programmers_level0;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/120921
 * */

public class _b197_���ڿ��б� {
	public static void main(String[] arg) {
		System.out.println((solution("hello","ohell")));

	}
	// ���ڰ� ������� ���1
	public static int solution(String A, String B) {
		String rotated = A;

        // 0ȸ �б⵵ �����ؾ� �ϹǷ� <= length
        for (int i = 0; i <= A.length(); i++) {
            if (rotated.equals(B)) {
                return i;
            }
            // ���������� �� ĭ �б�
            rotated = rotateRight(rotated);
        }

        return -1;
    }
	
	private static String rotateRight(String s) {
        // ������ ���� + ������ ���ڿ�
        return s.charAt(s.length() - 1) + s.substring(0, s.length() - 1);
    }
}

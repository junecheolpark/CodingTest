package programmers_level0;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181933
 * */

public class _b122_���̻�����Ȯ���ϱ� {
	public static void main(String[] arg) {
		System.out.println(solution("banana", "ana"));
		System.out.println(solution("banana", "nan"));
		System.out.println(solution("banana", "wxyz"));
		System.out.println(solution("banana", "abanana"));
	}
	// ���1
	public static int solution(String my_string, String is_suffix) {
		int mLen = my_string.length();
		int iLen = is_suffix.length();
		if(mLen < iLen) return 0;
		for (int i = iLen - 1; i >= 0; i--) { // ana �ǰ�� 2->0 ��
			if (my_string.charAt(mLen - iLen + i) != is_suffix.charAt(i)) {
				return 0;
			}
		}
		return 1;
	}
	
	// ���2 
	public static int solution2(String my_string, String is_suffix) {
		return my_string.endsWith(is_suffix) ? 1 : 0;
	}
}
package programmers_level0;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181933
 * */

public class _b123_���ڸ���Ʈ�����ڿ��κ�ȯ�ϱ� {
	public static void main(String[] arg) {
		String[] arr = {"a","b","c"};
		System.out.println(solution(arr));
	}
	// ���1
	public static String solution(String[] arr) {
		StringBuilder sb = new StringBuilder();
		for (String s : arr) {
			sb.append(s);
		}
        return sb.toString();
    }
	
}
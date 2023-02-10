package programmers_level0;

public class _a08_문자반복출력하기 {
	public static void main(String[] arg) {
		// int[] arr = {1, 1, 2, 3, 4, 5};
		String str = "hello";
		System.out.println(solution1(str, 3));
	}

	public static String solution1(String my_string, int n) {
		StringBuffer answer = new StringBuffer();
		for (int i = 0; i < my_string.length(); i++) {
			for (int j = 0; j < n; j++) {
				answer.append(my_string.charAt(i));
			}
		}
		return answer.toString();
	}
}

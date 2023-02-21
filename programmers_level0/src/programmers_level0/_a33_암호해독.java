package programmers_level0;

public class _a33_암호해독 {
	public static void main(String[] arg) {
		// int[] arr = { 1, 2, 3, 4, 5 };
		// String str = "hello";
		// String[] sarr = { "a", "b", "c" };
		System.out.println((solution("dfjardstddetckdaccccdegk", 4)));
		System.out.println((solution("pfqallllabwaoclk", 2)));
	}

	public static String solution(String cipher, int code) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < cipher.length(); i++) {
			if ((i + 1) % code == 0) {
				sb.append(cipher.charAt(i));
			}
		}
		return sb.toString();
	}
}
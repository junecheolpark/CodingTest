package programmers_level0;

public class _a31_가위바위보 {
	public static void main(String[] arg) {
		// int[] arr = { 1, 2, 3, 4, 5 };
		// String str = "hello";
		// String[] sarr = { "a", "b", "c" };
		System.out.println((solution("2")));
		System.out.println((solution("205")));
	}

	public static String solution(String rsp) {
		StringBuilder sb = new StringBuilder();
		int len = rsp.length();
		for (int i = 0; i < len; i++) {
			switch (rsp.charAt(i)) {
			case '0':
				sb.append("5");
				break;
			case '2':
				sb.append("0");
				break;
			case '5':
				sb.append("2");
				break;
			}
		}
		return sb.toString();
	}
}
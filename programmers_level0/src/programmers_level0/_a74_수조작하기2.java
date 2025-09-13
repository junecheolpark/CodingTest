package programmers_level0;

// https://school.programmers.co.kr/learn/courses/30/lessons/181915

public class _a74_수조작하기2 {
	public static void main(String[] arg) {
		int[] parts = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};

		System.out.println(solution(parts));
	}

	public static String solution(int[] numLog) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < numLog.length - 1; i++) {
			switch (numLog[i + 1] - numLog[i]) {
			case 1:
				sb.append("w");
				break;
			case -1:
				sb.append("s");
				break;
			case 10:
				sb.append("d");
				break;
			case -10:
				sb.append("a");
				break;
			}
		}
		return sb.toString();
	}

}
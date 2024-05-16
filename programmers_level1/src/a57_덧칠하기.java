//https://school.programmers.co.kr/learn/courses/30/lessons/161989

public class a57_µ¡Ä¥ÇÏ±â {
	public static void main(String[] arg) {
		int[] arr = { 2, 3, 6 };
		int[] arr2 = { 1, 3 };
		int[] arr3 = { 1, 2, 3, 4 };
		System.out.println(solution(8, 4, arr));
		System.out.println(solution(5, 4, arr2));
		System.out.println(solution(4, 1, arr3));
	}

	public static int solution(int n, int m, int[] section) {
		int num = section[0];
		int cnt = 1;

		for (int i = 0; i < section.length; i++) {
			if (num + m - 1 < section[i]) {
				cnt++;
				num = section[i];
			}
		}
		return cnt;
	}
}


//https://school.programmers.co.kr/learn/courses/30/lessons/12915

public class a43_내맘대로정렬 {
	public static void main(String[] arg) {
		String[] arr = { "sun", "bed", "car" };
		String[] strArray = solution(arr, 1);
		System.out.println(String.join(",", strArray));

	}

	public static String[] solution(String[] strings, int n) {
		String[] answer = strings;
		int sLength = strings.length;
		String temp = "";
		for (int i = 0; i < sLength; i++) {
			for (int j = 0; j < sLength - 1; j++) {
				temp = answer[j + 1];
				if (answer[0].charAt(n) > answer[j + 1].charAt(n)) {

				}
			}
		}
		if (strings[0].charAt(n) > strings[1].charAt(n)) {
			System.out.println(1);
		} else {
			System.out.println(2);
		}
		return answer;

	}
}

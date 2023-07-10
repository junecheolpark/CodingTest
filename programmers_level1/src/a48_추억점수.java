import java.util.HashMap;
import java.util.Map;

//https://school.programmers.co.kr/learn/courses/30/lessons/134240

public class a48_추억점수 {
	public static void main(String[] arg) {
		String[] name = { "may", "kein", "kain", "radi" };
		int[] yearning = { 5, 10, 1, 3 };
		String[][] photo = { { "may", "kein", "kain", "radi" }, { "may", "kein", "brin", "deny" },
				{ "kon", "kain", "may", "coni" } };
		int[] Array = solution(name, yearning, photo);
		for (int i = 0; i < Array.length; i++) {
			System.out.println(Array[i]);
		}
	}

	public static int[] solution(String[] name, int[] yearning, String[][] photo) {
		int[] answer = new int[photo.length];
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < name.length; i++) {
			map.put(name[i], yearning[i]);
		}

		for (int i = 0; i < photo.length; i++) {
			int num = 0;
			for (int j = 0; j < photo[i].length; j++) {
				if (map.containsKey(photo[i][j])) {
					num += map.get(photo[i][j]);
				}
			}
			answer[i] = num;
		}

		return answer;
	}
}

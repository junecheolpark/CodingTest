//https://school.programmers.co.kr/learn/courses/30/lessons/159994

public class a52_ī�并ġ {
	public static void main(String[] arg) {
		String[] arr = { "i", "drink", "water" };
		String[] arr2 = { "want", "to" };
		String[] arr3 = { "i", "want", "to", "drink", "water" };
		System.out.println(solution(arr, arr2, arr3));
	}

	public static String solution(String[] cards1, String[] cards2, String[] goal) {
		String answer = "Yes";
		int card1 = 0;
		int card2 = 0;

		for (int i = 0; i < goal.length; i++) {
			if (card1 < cards1.length && cards1[card1].equals(goal[i])) {
				card1++;
			} else if (card2 < cards2.length && cards2[card2].equals(goal[i])) {
				card2++;
			} else {
				answer = "No";
				break;
			}

		}
		return answer;
	}
}

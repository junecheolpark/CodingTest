import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class a15_서울에서김서방찾기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] seoul = { "Jane", "Kim" };
		String answer = new Solution15().solution(seoul);
		System.out.println(answer);

	}
}

class Solution15 {
	public String solution(String[] seoul) {
		String answer = "";
		for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals("Kim")) {
				answer = "김서방은 " + i + "에 있다";
			}
		}
		return answer;
	}
}

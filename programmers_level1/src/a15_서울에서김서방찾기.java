import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class a15_���￡���輭��ã�� {
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
				answer = "�輭���� " + i + "�� �ִ�";
			}
		}
		return answer;
	}
}

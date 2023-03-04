package programmers_level0;

import java.util.ArrayList;
import java.util.List;

public class _a51_모스부호 {
	public static void main(String[] arg) {
		// int[] arr2 = { 4, 455, 6, 4, -1, 45, 6 };
		// int[] arr3 = { 1, 2, 3 };
		// String str = "hello";
		// String[] sarr = { "a", "b", "c" };
		System.out.println((solution(".... . .-.. .-.. ---")));
		System.out.println((solution(".--. -.-- - .... --- -.")));
	}

	public static String solution(String letter) {
		StringBuilder sb = new StringBuilder();
		String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
		for (String word : letter.split(" ")) {
			for (int i = 0; i < morse.length; i++) {
				if (word.equals(morse[i])) {
					sb.append(Character.toString(i + 'a'));
				}
			}
		}
		return sb.toString();
	}
}
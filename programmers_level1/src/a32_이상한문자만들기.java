import java.util.Arrays;
import java.util.Scanner;

public class a32_이상한문자만들기 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		String s = "try hello world";
		String answer = new Solution32().solution(s);
		System.out.println(answer);
	}
}

class Solution32 {
	public String solution(String s) {
		char[] ch = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (i % 2 == 0) {
				sb.append(String.valueOf(ch[i]).toUpperCase());
			} else {
				sb.append(ch[i]);
			}
		}
		return sb.toString();
	}
}

package programmers_level0;

import java.util.Scanner;

public class _a05_ÇÇÀÚ³ª´²¸Ô±â {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		String s = "jaron";
		String answer = solution1(s);
		System.out.println(answer);
	}

	public static String solution1(String my_string) {
		StringBuffer sb = new StringBuffer(my_string);
        return sb.reverse().toString();
	}
}

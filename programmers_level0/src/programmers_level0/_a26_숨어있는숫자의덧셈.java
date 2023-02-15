package programmers_level0;

import java.util.Arrays;

public class _a26_¼û¾îÀÖ´Â¼ýÀÚÀÇµ¡¼À {
	public static void main(String[] arg) {
		// int[] arr = { 1, 2, 3, 4, 5 };
		// String str = "hello";
		// String[] sarr = { "a", "b", "c" };
		System.out.println((solution("aAb1B2cC34oOp")));
		System.out.println((solution("1a2b3c4d123")));
	}

	public static int solution(String my_string) {
		int answer = 0;
		 String str = my_string.replaceAll("[^0-9]","");
		 System.out.println(str);
		String[] s_l = my_string.split("");
		for (String s : s_l) {
			if (isNumeric(s)) {
				answer += Integer.parseInt(s);
			}
		}
		return answer;
	}

	public static boolean isNumeric(String s) {
		try {
			Integer.parseInt(s);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}

/*
 int answer = 0;
        String str = my_string.replaceAll("[^0-9]","");

        for(char ch : str.toCharArray()) {
            answer += Character.getNumericValue(ch);
        }

        return answer;
 */

package programmers_level0;

public class _a15_특정문자제거하기 {
	public static void main(String[] arg) {
		// int[] arr = { 199, 72, 222 };
		// String str = "hello";
		System.out.println((solution("abcdef", "f")));
	}

	public static String solution(String my_string, String letter) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<my_string.length(); i++) {
        	if(my_string.charAt(i) != letter.charAt(0)) {
        		sb.append(my_string.charAt(i));
        	}
        }
        return sb.toString();
    }
}

// 방법 2 return my_string.replace(letter, "");

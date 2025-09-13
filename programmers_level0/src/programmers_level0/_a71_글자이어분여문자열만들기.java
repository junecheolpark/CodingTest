package programmers_level0;

// https://school.programmers.co.kr/learn/courses/30/lessons/181915

public class _a71_글자이어분여문자열만들기 {
	public static void main(String[] arg) {
		String my_strings = "zpiaz";
		int[] parts = { 1, 2, 0, 0, 3 };

		System.out.println((solution(my_strings, parts)));
	}

	public static String solution(String my_string, int[] index_list) {
		StringBuilder sb = new StringBuilder();
		
		for (int index : index_list) {
			sb.append(my_string.charAt(index));
		}
		return sb.toString();
	}

}
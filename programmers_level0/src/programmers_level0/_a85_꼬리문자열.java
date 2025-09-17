package programmers_level0;
/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181841
 * */

public class _a85_²¿¸®¹®ÀÚ¿­ {
	public static void main(String[] arg) {
		String[] arr = { "abc", "def", "ghi" };
		System.out.println(solution(arr, "ef"));
//		System.out.println(Arrays.toString(solution(arr, "ef")));
	}

	public static String solution(String[] str_list, String ex) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str_list.length; i++) {
			if (!str_list[i].contains(ex))
				sb.append(str_list[i]);
		}

		return sb.toString();
	}

}
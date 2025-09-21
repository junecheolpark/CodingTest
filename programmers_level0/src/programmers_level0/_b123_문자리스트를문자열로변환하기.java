package programmers_level0;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181933
 * */

public class _b123_문자리스트를문자열로변환하기 {
	public static void main(String[] arg) {
		String[] arr = {"a","b","c"};
		System.out.println(solution(arr));
	}
	// 방법1
	public static String solution(String[] arr) {
		StringBuilder sb = new StringBuilder();
		for (String s : arr) {
			sb.append(s);
		}
        return sb.toString();
    }
	
}
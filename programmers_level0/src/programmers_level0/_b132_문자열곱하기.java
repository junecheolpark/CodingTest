package programmers_level0;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181940
 * */

public class _b132_문자열곱하기 {
	public static void main(String[] arg) {
		System.out.println((solution("string", 3)));
	}

	/*
	 * Java 11 이상이면 repeat() 사용 추천 
	 * Java 8 이하 → StringBuilder 반복문 사용
	 */
	public static String solution(String my_string, int k) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < k; i++) {
			sb.append(my_string);
		}
		return sb.toString();
		//return my_string.repeat(k);
	}

}
package programmers_level0;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/120921
 * */

public class _b197_문자열밀기 {
	public static void main(String[] arg) {
		System.out.println((solution("hello","ohell")));

	}
	// 숫자가 작을경우 방법1
	public static int solution(String A, String B) {
		String rotated = A;

        // 0회 밀기도 포함해야 하므로 <= length
        for (int i = 0; i <= A.length(); i++) {
            if (rotated.equals(B)) {
                return i;
            }
            // 오른쪽으로 한 칸 밀기
            rotated = rotateRight(rotated);
        }

        return -1;
    }
	
	private static String rotateRight(String s) {
        // 마지막 문자 + 나머지 문자열
        return s.charAt(s.length() - 1) + s.substring(0, s.length() - 1);
    }
}

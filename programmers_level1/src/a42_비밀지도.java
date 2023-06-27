
//https://school.programmers.co.kr/learn/courses/30/lessons/147355?language=java

public class a42_비밀지도 {
	public static void main(String[] arg) {
		System.out.println(solution("3141592", "271"));
		System.out.println(solution("500220839878", "7"));
		System.out.println(solution("10203", "15"));
	}

	public static int solution(String t, String p) {
		int cnt = 0;
	    int tLength = t.length();
	    int pLength = p.length();
	    Long pNum = Long.valueOf(p);

	    for (int i = 0; i <= tLength - pLength; i++) {
	        String substring = t.substring(i, i + pLength);
	        Long currentNum = Long.valueOf(substring);

	        if (currentNum <= pNum)
	            cnt++;
	    }
	    return cnt;
	}
}

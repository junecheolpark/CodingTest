package programmers_level0;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/120863
 * */

public class _b205_다항식더하기 {
	public static void main(String[] arg) {
		System.out.println((solution("3x + 7 + x")));

	}

	private static String solution(String polynomial) {
		String[] terms = polynomial.split(" \\+ ");
        int xSum = 0; // x의 계수 합
        int numSum = 0; // 상수항 합

        for (String term : terms) {
            if (term.contains("x")) {
                // "x" 또는 "3x" 형태
                String coef = term.replace("x", "");
                xSum += coef.equals("") ? 1 : Integer.parseInt(coef);
            } else {
                numSum += Integer.parseInt(term);
            }
        }

        // 결과 문자열 만들기
        if (xSum == 0) return String.valueOf(numSum);
        if (numSum == 0) return (xSum == 1) ? "x" : xSum + "x";
        return (xSum == 1 ? "x" : xSum + "x") + " + " + numSum;
	}

}

package programmers_level0;

import java.util.Arrays;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181893
 * */

public class _b205_���׽Ĵ��ϱ� {
	public static void main(String[] arg) {
		int[] arr = { 0, 1, 2, 3, 4, 5 };
		int[] arr2 = { 4, 1, 2 };
		System.out.println(Arrays.toString(solution("3x + 7 + x")));

	}

	private static String solution(String polynomial) {
		String[] terms = polynomial.split(" \\+ ");
        int xSum = 0; // x�� ��� ��
        int numSum = 0; // ����� ��

        for (String term : terms) {
            if (term.contains("x")) {
                // "x" �Ǵ� "3x" ����
                String coef = term.replace("x", "");
                xSum += coef.equals("") ? 1 : Integer.parseInt(coef);
            } else {
                numSum += Integer.parseInt(term);
            }
        }

        // ��� ���ڿ� �����
        if (xSum == 0) return String.valueOf(numSum);
        if (numSum == 0) return (xSum == 1) ? "x" : xSum + "x";
        return (xSum == 1 ? "x" : xSum + "x") + " + " + numSum;
	}

}

package programmers_level0;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/120922
 * */

public class _b188_종이자르기 {
	public static void main(String[] arg) {
		System.out.println((solution(4, 4)));
	}

	public static int solution(int M, int N) {
		int mNum = M - 1;
		int nNum = N - 1;
		return (mNum + (nNum * M));
//		return M * N - 1;
	}
}

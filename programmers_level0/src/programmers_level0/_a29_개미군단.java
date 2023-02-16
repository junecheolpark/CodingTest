package programmers_level0;

public class _a29_개미군단 {
	public static void main(String[] arg) {
		// int[] arr = { 1, 2, 3, 4, 5 };
		// String str = "hello";
		// String[] sarr = { "a", "b", "c" };
		System.out.println((solution(23)));
		System.out.println((solution(999)));
	}

	public static int solution(int hp) {
		int answer = 0;
		while (hp != 0) {
			if (hp - 5 >= 0) {
				hp -= 5;
			} else if (hp - 3 >= 0) {
				hp -= 3;
			} else {
				hp -= 1;
			}
			answer++;
		}
		return answer;
	}
}
/*
 *  int answer = hp / 5;
        hp %= 5;

        answer += hp / 3;
        hp %= 3;

        answer += hp / 1;

        return answer;
        */

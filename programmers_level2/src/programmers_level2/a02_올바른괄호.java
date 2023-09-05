package programmers_level2;

//https://school.programmers.co.kr/learn/courses/30/lessons/12909

public class a02_올바른괄호 {
	public static void main(String[] args) {
		System.out.println(solution("()()"));
		System.out.println(solution("(())()"));
		System.out.println(solution(")()("));
		System.out.println(solution("(()("));
	}

	public static boolean solution(String s) {
		int num1 = 0;
		int num2 = 0;
		char[] cArr = s.toCharArray();
		
		for (int i = 0; i < cArr.length; i++) {
			if (cArr[i] == '(') {
				num1++;
			} else {
				num2++;
			}

			if (cArr[0] == ')' || num1 < num2) { // 처음에 )라면 false, (수가 )보다 적다면
				return false;
			}
		}
		return num1 == num2;
	}

}

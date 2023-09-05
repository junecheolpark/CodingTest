package programmers_level2;

//https://school.programmers.co.kr/learn/courses/30/lessons/12909

public class a02_�ùٸ���ȣ {
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

			if (cArr[0] == ')' || num1 < num2) { // ó���� )��� false, (���� )���� ���ٸ�
				return false;
			}
		}
		return num1 == num2;
	}

}

package programmers_level0;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181874
 * */

public class _b118_A강조하기 {
	public static void main(String[] arg) {
		System.out.println(solution("abstract algebra"));
	}

	//방법1 조건이 더 복잡해질 가능성이 있거나 입력이 클경우
	public static String solution(String myString) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < myString.length(); i++) {
			if (myString.charAt(i) == 'a') {
				sb.append('A');
			} else if (myString.charAt(i) != 'A') {
				sb.append(Character.toLowerCase(myString.charAt(i)));
			}
		}
		return sb.toString();
	}

	// 방법2 단순하고 입력이 짧을경우
	public static String solution2(String myString) {
		myString = myString.toLowerCase();
		myString = myString.replace('a', 'A');

		return myString;
	}

}
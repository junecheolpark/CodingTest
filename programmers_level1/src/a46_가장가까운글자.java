//https://school.programmers.co.kr/learn/courses/30/lessons/142086

public class a46_가장가까운글자 {
	public static void main(String[] arg) {
		int[] Array = solution("banana");
		for (int i = 0; i < Array.length; i++) {
			System.out.println(Array[i]);
		}

	}

	public static int[] solution(String s) {
		int[] answer = new int[s.length()];
		char[] ch = s.toCharArray(); // 문자 배열로 변경

		for (int i = 0; i < ch.length; i++) {
			int cnt = 0;
			for (int j = i; j > 0; j--) { // 현재 문자에서 배열[0]까지 조회후 없으면 -1 있으면 떨어진 차이 만큼 저장 
				cnt++;
				if (ch[i] == ch[j - 1]) {
					break;
				} else if (j - 1 == 0) {
					cnt = 0;
				}
			}
			answer[i] = (cnt == 0 ? -1 : cnt);
		}
		return answer;
	}
}

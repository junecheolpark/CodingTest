import java.util.Scanner;

public class a25_문자열다루기기본 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		boolean answer = new Solution25().solution(s);
		System.out.println(answer);

	}
}

class Solution25 {
	public boolean solution(String s) {
		/*/
		if(s.length() != 4 && s.length() != 6) return false; // 문자의 길이값이 4,6 아니라면 false
		return s.matches("^[0-9]*$"); // match()함수를 통해 정규표현식과 동일한 패턴이면 true
		/**/
		/**/
		boolean answer = true;

	      if (s.length() != 4 && s.length() != 6) return false; // 문자의 길이값이 4,6 아니라면 false
	      for (int i = 0; i < s.length(); i++) {
	          if (s.charAt(i) < '0' || s.charAt(i) > '9') return false; //문자열 하나씩 반복해가며 '0'보다 적거나 '9'보다 크면 false 리턴
	      }
	      return answer; // 위조건이 통과됬다면 true
	      /**/
	}
}
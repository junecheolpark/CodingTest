import java.util.Scanner;

public class a21_가운데글자가져오기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String answer = new Solution21().solution(s);
		System.out.println(answer);

	}
}

class Solution21 {
	public String solution(String s) {
		//방법1
		/*/
		StringBuilder sb = new StringBuilder();
		int leng = s.length();
		if (s.length() % 2 != 0) { // 홀수라면
			sb.append(s.charAt(leng / 2));
			return sb.toString();
		}
		for (int i = 0; i < leng; i++) { // 짝수라면
			if (i == leng / 2 - 1 || i == leng / 2) {
				sb.append(s.charAt(i));
			}
		}
		return sb.toString();
		/**/
		
		//방법2 (속도가 더 빠름)
		/**/
		int leng = s.length(); // String s 길이값만큼 leng에 정의
		String s2;
		
		if (leng % 2 == 0) { // 짝수라면
			//substr, substring, slice 차이 검색후 참고로 올리기 https://velog.io/@siugan/Javascript-%EB%AC%B8%EC%9E%90%EC%97%B4-%EC%9E%90%EB%A5%B4%EA%B8%B0-substr-substring-slice
			s2 = s.substring(leng / 2 - 1, leng / 2 + 1); //  abcd 일경우 1,3-> 1=b부터 3전인 2=c까지 s에 정의해줌
		} else {
			s2 = s.substring(leng / 2, leng / 2 + 1); // abcde 일경우 2,3위치전까지 출력이므로 2=c만 s에 정의해줌
		}
		return s2;
		/**/
	}
}

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class a09_문자열내p와y개수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		boolean answer = new Solution9().solution(s);
		System.out.println(answer);

	}
}

class Solution9 {
	 boolean solution(String s) {
		 /*/
		  int yCnt = 0;
		  int pCnt = 0;
		  char[] ch = s.toCharArray(); // String s 를 char형 배열로 저장
		  for(int i = 0; i<s.length(); i++) { 
			  if(ch[i] =='p' || ch[i] == 'P') { //하나씩 조회해 p,P 와같다면 pCnt업
				  pCnt++;
			  }
			  else if(ch[i] =='y' || ch[i] == 'Y') { //하나씩 조회해 y,Y 와같다면 yCnt업
				  yCnt++;
			  }
		  }
		  return yCnt == pCnt; // y개수와 p개수가 같다면
		  /**/
		 int cnt = 0;
		 for (int i = 0; i<s.length(); i++) {
			 if(s.charAt(i) == 'p' || s.charAt(i) == 'P') { // p,P와 같다면 카운트 업
				 cnt++;
			 }else  if(s.charAt(i) == 'y' || s.charAt(i) == 'Y') { //y,Y와 같다면 카운트 다운
				 cnt--;
			 }
			 
		 }
		 return cnt == 0 ? true : false; // cnt가 0이면 true아니면 false
	}
}


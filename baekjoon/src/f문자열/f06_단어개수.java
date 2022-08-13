package f문자열;

/*/
단어의 개수

문제
영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 

프로그램을 작성하시오. 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.

입력
첫 줄에 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열의 길이는 1,000,000을 넘지 않는다. 

단어는 공백 한 개로 구분되며, 공백이 연속해서 나오는 경우는 없다. 또한 문자열은 공백으로 시작하거나 끝날 수 있다.

출력
첫째 줄에 단어의 개수를 출력한다.

예제 입력1 The Curious Case of Benjamin Button

예제 출력1 6
/**/
import java.util.Scanner;
import java.util.StringTokenizer;

public class f06_단어개수 {
	public static void main(String[] args) {
		/*/
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		String str = sc.nextLine();
		// 공백기준으로 자름
		String[] stnl = str.split(" ");
		//stnl 배열 길이만큼 카운트 업
		for (int i = 0; i < stnl.length; i++) {
			cnt++;
		}
		//시작시 공백이 있을경우 -1
		if (str.charAt(0) == ' ' && str.charAt(str.length()-1) == ' ') {
			cnt = cnt-1;
		}
		System.out.println(cnt);
		/**/
			Scanner in = new Scanner(System.in);
	 
			String S = in.nextLine();
			in.close();
	 
			// st 에 공백을 기준으로 나눈 토큰들을 st 에 저장한다
			StringTokenizer st = new StringTokenizer(S," ");
			
			// countTokens() 는 토큰의 개수를 반환한다
			System.out.println(st.countTokens());	
			
	 
	}
}

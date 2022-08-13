package f문자열;

/*/
단어 공부

문제
알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.

입력
첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.

출력
첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.

예제 입력1 Mississipi

예제 출력1 ?
/**/
import java.util.Scanner;

public class f05_단어공부 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[26]; // 영문자 개수
		String s = sc.next();

		for (int i = 0; i < s.length(); i++) {

			if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') {// 대문자일경우
				arr[s.charAt(i) - 'A']++;
			} else { //소문자일 경우
				arr[s.charAt(i) - 'a']++;
			}
		}
		
		int max = -1;
		char ch = '?';
		for (int i = 0; i < 26; i++) { //가장 많은 문자 출력
			if (arr[i] > max) {
				max = arr[i];
				ch = (char) (i + 'A'); //대문자로 출력
			} else if (arr[i] == max) { //2개 이상일경우 ?로 출력
				ch = '?';
			}
		}
		System.out.println(ch);
	}
}

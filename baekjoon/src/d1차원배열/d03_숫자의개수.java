package d1차원배열;

/*/
숫자의개수
문제
세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.

예를 들어 A = 150, B = 266, C = 427 이라면 A × B × C = 150 × 266 × 427 = 17037300 이 되고, 

계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.

입력
첫째 줄에 A, 둘째 줄에 B, 셋째 줄에 C가 주어진다. A, B, C는 모두 100보다 크거나 같고, 1,000보다 작은 자연수이다.

출력
첫째 줄에는 A × B × C의 결과에 0 이 몇 번 쓰였는지 출력한다. 마찬가지로 둘째 줄부터 
 열 번째 줄까지 A × B × C의 결과에 1부터 9까지의 숫자가 각각 몇 번 쓰였는지 차례로 한 줄에 하나씩 출력한다.

예제 입력1 150
		266
		427

예제 출력1 3
		1
		0
		2
		0
		0
		0
		2
		0
		0
/**/
import java.util.Scanner;

public class d03_숫자의개수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, num;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		num = a * b * c;
		//String 타입으로 변환
		String str = Integer.toString(num);

		for (int i = 0; i < 10; i++) {
			int index = 0;
			for (int j = 0; j < str.length(); j++) {
				//반드시 charAt() 을 쓸 경우  - '0' 또는 -48 을 연산해야 한다. (아니면 아스키코드에 대응하는 문자가 나온다.)
				if (str.charAt(j) - '0' == i) {
					index++;
				}
			}
			System.out.println(index);
		}
	}
}

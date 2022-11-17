package h기본수학2;


/*/
소수 찾기

문제
주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
입력
첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다

출력
주어진 수들 중 소수의 개수를 출력한다.

예제 입력1 4
		1 3 5 7

예제 출력1 3
/**/
import java.util.Scanner;

public class g01_손익분기점 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in) ;
		
		int N = in.nextInt();
		
		int count = 0;
		
		for(int i = 0; i < N; i++) {
			
			// 소수인경우 true, 아닌경우 false   
			boolean isPrime = true;
			
			int num = in.nextInt();
			
			if(num == 1) {	// 1 인경우 다음 반복문으로
				continue;
			}
			for(int j = 2; j <= Math.sqrt(num); j++) {
				if(num % j == 0) {
					isPrime = false;	// 소수가 아니므로 false 로 바꿔줌
					break;
				}
			}
			if(isPrime) {	// 소수인경우 count 값 1 증가
				count++;
			}
		}
		System.out.println(count);
	}
 
}


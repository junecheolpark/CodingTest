package 입출력과사칙연산;

import java.util.Scanner;
/*/
곱하기
문제
(세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.



(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
입력
첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.
출력
첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다
예제 입력1 472
		385
예제 출력1 2360
		3776
		1416
		181720

/**/
public class a12_곱하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A,B;
		A = sc.nextInt();
		B = sc.nextInt();
		int q1= (B%10) *A;
		int q2= ((B%100)/10) *A;
		int q3= (B/100) *A;
		System.out.println(q1);
		System.out.println(q2);
		System.out.println(q3);
		System.out.println(A*B);
	}
}

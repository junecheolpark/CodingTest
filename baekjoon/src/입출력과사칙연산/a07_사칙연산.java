package 입출력과사칙연산;

import java.util.Scanner;
/*/
사칙연산
두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. 
두 자연수 A와 B가 주어진다. (1 ≤ A, B ≤ 10,000)
첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.
예제 입력 7 3
예제 출력 10
		4
		21
		2
		1
/**/
public class a07_사칙연산 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A,B;
		A = sc.nextInt();
		B = sc.nextInt();
		System.out.println(A+B);
		System.out.println(A-B);
		System.out.println(A*B);
		System.out.println(A/B);
		System.out.println(A%B);
	}
}

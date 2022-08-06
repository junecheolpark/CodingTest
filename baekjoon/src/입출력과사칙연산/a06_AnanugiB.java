package 입출력과사칙연산;

import java.util.Scanner;
/*/
A/B
두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
첫째 줄에 A/B를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.
예제 입력1 1 3
예제 출력1 0.333
예제 입력2 4 5
예제 출력2 0.8
/**/
public class a06_AnanugiB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double A,B;
		A = sc.nextDouble();
		B = sc.nextDouble();
		System.out.println(A/B);
	
	}
}

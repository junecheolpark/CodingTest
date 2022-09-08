package e함수;

/*/
정수 N개의 합

문제
정수 n개가 주어졌을 때, n개의 합을 구하는 함수를 작성하시오.

작성해야 하는 함수는 다음과 같다.

Java: long sum(int[] a); (클래스 이름: Test)
a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열 (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
리턴값: a에 포함되어 있는 정수 n개의 합

입력
첫째 줄에는 테스트 케이스의 개수 C가 주어진다.

둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다. 
점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.

출력
각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.

예제 입력1 

예제 출력1 
/**/
import java.util.Scanner;
public class e01_정수N개의합 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//구현 코드
		/*
		 int n,a = 0;
		
		n = sc.nextInt();
		for(int i = 0; i<n; i++) {
			a += sc.nextInt();
		}
			System.out.println(a);
			*/
		//함수 실행 준비
		int n;
		n= sc.nextInt();
		int[] a = new int[n];
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		long b = new Test().sum(a);
		System.out.println(b);
		
		}
	}
//함수
/**/
class Test{
	long sum(int[] a) {
		long sum = 0;
		
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		return sum;
		
	}
}
/**/

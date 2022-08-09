package c반복문;

import java.util.Scanner;

/*/
합
문제
n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.

출력
1부터 n까지 합을 출력한다.

예제 입력1 3

예제 출력1 6


/**/
public class c03_합 {
	 public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        int a;
	        int b = 0;
	        a=sc.nextInt();
	        for(int i=1; i<=a ;i++) {
	        	b = b+i;
	        }
	        System.out.println(b);
	    }
}

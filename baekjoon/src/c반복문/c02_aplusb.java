package c�ݺ���;

import java.util.Scanner;

/*/
a+b
����
�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.

�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)

���
�� �׽�Ʈ ���̽����� A+B�� ����Ѵ�.

���� �Է�1 5
		1 1
		2 3
		3 4
		9 8
		5 2

���� ���1 2
		5
		7
		17
		7


/**/
public class c02_aplusb {
	 public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        int a;
	        a=sc.nextInt();
	        for(int i=1; i<=9;i++) {
	        	System.out.println(a + " * " + i + " = " + (a*i));
	        }
	    }
}

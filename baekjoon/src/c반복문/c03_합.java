package c�ݺ���;

import java.util.Scanner;

/*/
��
����
n�� �־����� ��, 1���� n���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� n (1 �� n �� 10,000)�� �־�����.

���
1���� n���� ���� ����Ѵ�.

���� �Է�1 3

���� ���1 6


/**/
public class c03_�� {
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

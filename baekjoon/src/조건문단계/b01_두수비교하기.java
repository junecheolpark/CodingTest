package ���ǹ��ܰ�;

import java.util.Scanner;

/*/
�� �� ���ϱ�
����
�� ���� A�� B�� �־����� ��, A�� B�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
�Է�
ù° �ٿ� A�� B�� �־�����. A�� B�� ���� �� ĭ���� ���еǾ��� �ִ�.
���
ù° �ٿ� ���� �� ���� �� �ϳ��� ����Ѵ�.

A�� B���� ū ��쿡�� '>'�� ����Ѵ�.
A�� B���� ���� ��쿡�� '<'�� ����Ѵ�.
A�� B�� ���� ��쿡�� '=='�� ����Ѵ�.
���� �Է�1 1 2
���� ���1 <
���� �Է�2 10 2
���� ���2 >
���� �Է�2 5 5
���� ���2 ==


/**/
public class b01_�μ����ϱ� {
	 public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        int a,b;
	        a=sc.nextInt();
	        b=sc.nextInt();
	        if(a<b){
	            System.out.println("<");
	        }else if(a>b){
	            System.out.println(">");
	        }else if(a==b){
	            System.out.println("==");
	        }
	    }
}

package c�ݺ���;

import java.util.Scanner;

/*/
������
����
N�� �Է¹��� ��, ������ N���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ��� ���Ŀ� ���缭 ����ϸ� �ȴ�.

�Է�
ù° �ٿ� N�� �־�����. N�� 1���� ũ�ų� ����, 9���� �۰ų� ����.

���
������İ� ���� N*1���� N*9���� ����Ѵ�.

���� �Է�1 2
���� ���1 2 * 1 = 2
		2 * 2 = 4
		2 * 3 = 6
		2 * 4 = 8
		2 * 5 = 10
		2 * 6 = 12
		2 * 7 = 14
		2 * 8 = 16
		2 * 9 = 18


/**/
public class c01_������ {
	 public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        int a,b,c;
	        a=sc.nextInt();
	        for(int i=0; i<a; i++) {
	        	b=sc.nextInt();
	        	c=sc.nextInt();
	        	System.out.println(b+c);
	        }
	    }
}

package b���ǹ��ܰ�;

import java.util.Scanner;

/*/
���� ����
����
���� ������ �Է¹޾� 90 ~ 100���� A, 80 ~ 89���� B, 70 ~ 79���� C, 60 ~ 69���� D, ������ ������ F�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
�Է�
ù° �ٿ� ���� ������ �־�����. ���� ������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�.
���
���� ������ ����Ѵ�.

���� �Է�1 100
���� ���1 A


/**/
public class b02_���輺�� {
	 public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        int a;
	        a=sc.nextInt();
	        if(a<=100 && a>=90){
	            System.out.println("A");
	        }else if(a<=89 && a>=80){
	            System.out.println("B");
	        }else if(a<=79 && a>=70){
	            System.out.println("C");
	        }else if(a<=69 && a>=60){
	            System.out.println("D");
	        }else {
	        	System.out.println("F");
	        }
	    }
}

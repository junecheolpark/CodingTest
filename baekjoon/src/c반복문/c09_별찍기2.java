package c�ݺ���;



/*/
�� ���2
����
ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����

������, �������� �������� ������ ��(���� ����)�� ����Ͻÿ�.

�Է�
ù° �ٿ� N(1 �� N �� 100)�� �־�����.

���
ù° �ٺ��� N��° �ٱ��� ���ʴ�� ���� ����Ѵ�.

���� �Է�1 5

���� ���1     *
		   **
		  ***
		 ****
		*****
/**/
import java.util.Scanner;

public class c09_�����2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,i,j;
		n = sc.nextInt();
		for(i=1; i<=n; i++) {
			for(j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
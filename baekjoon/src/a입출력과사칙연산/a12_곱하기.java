package a����°���Ģ����;

import java.util.Scanner;
/*/
���ϱ�
����
(�� �ڸ� ��) �� (�� �ڸ� ��)�� ������ ���� ������ ���Ͽ� �̷������.



(1)�� (2)��ġ�� �� �� �ڸ� �ڿ����� �־��� �� (3), (4), (5), (6)��ġ�� �� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
�Է�
ù° �ٿ� (1)�� ��ġ�� �� �� �ڸ� �ڿ�����, ��° �ٿ� (2)�� ��ġ�� �� ���ڸ� �ڿ����� �־�����.
���
ù° �ٺ��� ��° �ٱ��� ���ʴ�� (3), (4), (5), (6)�� �� ���� ����Ѵ�
���� �Է�1 472
		385
���� ���1 2360
		3776
		1416
		181720

/**/
public class a12_���ϱ� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A,B;
		A = sc.nextInt();
		B = sc.nextInt();
		int q1= (B%10) *A;
		int q2= ((B%100)/10) *A;
		int q3= (B/100) *A;
		System.out.println(q1);
		System.out.println(q2);
		System.out.println(q3);
		System.out.println(A*B);
	}
}

package c�ݺ���;



/*/
x���� ������
����
���� N���� �̷���� ���� A�� ���� X�� �־�����. �̶�, A���� X���� ���� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� N�� X�� �־�����. (1 �� N, X �� 10,000)

��° �ٿ� ���� A�� �̷�� ���� N���� �־�����. �־����� ������ ��� 1���� ũ�ų� ����, 10,000���� �۰ų� ���� �����̴�.

���
X���� ���� ���� �Է¹��� ������� �������� ������ ����Ѵ�. X���� ���� ���� ��� �ϳ� �����Ѵ�.
���� �Է�1 10 5
		 1 10 4 9 2 3 8 5 7 6

���� ���1 1 4 2 3
/**/
import java.util.Scanner;

public class c10_X����������{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,x,a;
		n = sc.nextInt();
		x = sc.nextInt();
		for(int i=1; i<=n; i++) {
			a = sc.nextInt();
			if (a<x) {
				System.out.print(a+" ");
			}
		}
	}
}
package e�Լ�;

/*/
���� N���� ��

����
���� n���� �־����� ��, n���� ���� ���ϴ� �Լ��� �ۼ��Ͻÿ�.

�ۼ��ؾ� �ϴ� �Լ��� ������ ����.

Java: long sum(int[] a); (Ŭ���� �̸�: Test)
a: ���� ���ؾ� �ϴ� ���� n���� ����Ǿ� �ִ� �迭 (0 �� a[i] �� 1,000,000, 1 �� n �� 3,000,000)
���ϰ�: a�� ���ԵǾ� �ִ� ���� n���� ��

�Է�
ù° �ٿ��� �׽�Ʈ ���̽��� ���� C�� �־�����.

��° �ٺ��� �� �׽�Ʈ ���̽����� �л��� �� N(1 �� N �� 1000, N�� ����)�� ù ���� �־�����, �̾ N���� ������ �־�����. 
������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�.

���
�� ���̽����� �� �پ� ����� �Ѵ� �л����� ������ �ݿø��Ͽ� �Ҽ��� ��° �ڸ����� ����Ѵ�.

���� �Է�1 

���� ���1 
/**/
import java.util.Scanner;
public class e01_����N������ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//���� �ڵ�
		/*
		 int n,a = 0;
		
		n = sc.nextInt();
		for(int i = 0; i<n; i++) {
			a += sc.nextInt();
		}
			System.out.println(a);
			*/
		//�Լ� ���� �غ�
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
//�Լ�
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

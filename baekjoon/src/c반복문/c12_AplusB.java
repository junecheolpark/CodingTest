package c�ݺ���;
/*/
A+B -4
����
�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�

�Է�
�Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�.

�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)

�Է��� ���������� 0 �� ���� ���´�.

���
�� �׽�Ʈ ���̽����� A+B�� ����Ѵ�.

���� �Է�1 1 1
		2 3
		3 4
		9 8
		5 2
		0 0

���� ���1 2
		5
		7
		17
		7
		
sc.hasNextInt() -> �Է°��� int���ϰ�� true
/**/
import java.util.Scanner;

public class c12_AplusB{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		while(sc.hasNextInt()) {
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(a+b);
		}
		
	}
}

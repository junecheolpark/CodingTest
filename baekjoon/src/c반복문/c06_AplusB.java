package c�ݺ���;

import java.util.Scanner;

/*/
������
����
�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.

�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)

���
�� �׽�Ʈ ���̽����� "Case #x: "�� ����� ����, A+B�� ����Ѵ�. �׽�Ʈ ���̽� ��ȣ�� 1���� �����Ѵ�.

���� �Է�1 5
		1 1
		2 3
		3 4
		9 8
		5 2

���� ���1 Case #1: 2
		Case #2: 5
		Case #3: 7
		Case #4: 17
		Case #5: 7

/**/
public class c06_AplusB{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t;
		int a,b=0;
		t = sc.nextInt();
		for(int i=1; i<=t; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println("Case #"+i+": "+(a+b));
		}
	}
}
package e�Լ�;

/*/
����� �Ѱ���

����
� ���� ���� X�� �� �ڸ��� ���������� �̷�ٸ�, �� ���� �Ѽ���� �Ѵ�. ���������� ���ӵ� �� ���� ���� ���̰� ������ ������ ���Ѵ�. 
N�� �־����� ��, 1���� ũ�ų� ����, N���� �۰ų� ���� �Ѽ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 

�Է�
ù° �ٿ� 1,000���� �۰ų� ���� �ڿ��� N�� �־�����.

���
ù° �ٿ� 1���� ũ�ų� ����, N���� �۰ų� ���� �Ѽ��� ������ ����Ѵ�.

���� �Է�1 110

���� ���1 99
/**/
import java.util.Scanner;

public class e03_�Ѽ� {
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print(arithmetic_sequence(in.nextInt()));
		in.close();
 
		
	}
 
	public static int arithmetic_sequence(int num) {
		int cnt = 0; // �Ѽ� ī����
 
		if (num < 100) {
			return num;
		}
 
		else {
			cnt = 99;
 
			for (int i = 100; i <= num; i++) {
				int hun = i / 100; // ���� �ڸ���
				int ten = (i / 10) % 10; // ���� �ڸ���
				int one = i % 10;
 
				if ((hun - ten) == (ten - one)) { // �� �ڸ����� ������ �̷��
					cnt++;
				}
			}
		}
 
		return cnt;
	}
 
}


package f���ڿ�;

/*/
���ڿ� �ݺ�

����
���ڿ� S�� �Է¹��� �Ŀ�, �� ���ڸ� R�� �ݺ��� �� ���ڿ� P�� ���� �� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ��, ù ��° ���ڸ� R�� �ݺ��ϰ�,
 �� ��° ���ڸ� R�� �ݺ��ϴ� ������ P�� ����� �ȴ�. S���� QR Code "alphanumeric" ���ڸ� ����ִ�.

QR Code "alphanumeric" ���ڴ� 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: �̴�.

�Է�
ù° �ٿ� �׽�Ʈ ���̽��� ���� T(1 �� T �� 1,000)�� �־�����. �� �׽�Ʈ ���̽��� �ݺ� Ƚ�� R(1 �� R �� 8), ���ڿ� S�� �������� 
���еǾ� �־�����. S�� ���̴� ��� 1�̸�, 20���ڸ� ���� �ʴ´�. 

���
�� �׽�Ʈ ���̽��� ���� P�� ����Ѵ�.

���� �Է�1 2
3 ABC
5 /HTP

���� ���1 AAABBBCCC
/////HHHHHTTTTTPPPPP
/**/
import java.util.Scanner;

public class f04_���ڿ��ݺ� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {// n���� �Է��� ����

			int r = sc.nextInt();
			String s = sc.next(); //nextLine() ������ 

			for (int j = 0; j < s.length(); j++) { // s���ڱ��̸�ŭ �ݺ��Ͽ� �˻�
				for (int l = 0; l < r; l++) {
					System.out.print(s.charAt(j));
				}
			}

			System.out.println();
		}
	}
}

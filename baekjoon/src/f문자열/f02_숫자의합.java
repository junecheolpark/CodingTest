package f���ڿ�;


/*/
������ ��

����
N���� ���ڰ� ���� ���� �����ִ�. �� ���ڸ� ��� ���ؼ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� ������ ���� N (1 �� N �� 100)�� �־�����. ��° �ٿ� ���� N���� ������� �־�����.

���
�Է����� �־��� ���� N���� ���� ����Ѵ�.

���� �Է�1 5
		54321

���� ���1 15

/**/
import java.util.Scanner;
public class f02_�������� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int sum = 0;
		n = sc.nextInt();	
		String a = sc.next();
		for(int i=0; i<a.length(); i++) {
			sum += a.charAt(i)-'0';
		}
		System.out.println(sum);
		}
	}


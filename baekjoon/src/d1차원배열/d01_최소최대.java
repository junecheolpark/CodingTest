package d1�����迭;
/*/
�ּ� �ִ�
����
N���� ������ �־�����. �̶�, �ּڰ��� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� ������ ���� N (1 �� N �� 1,000,000)�� �־�����. ��° �ٿ��� N���� ������ �������� �����ؼ� �־�����. ��� ������ -1,000,000���� ũ�ų� ����, 1,000,000���� �۰ų� ���� �����̴�.

���
ù° �ٿ� �־��� ���� N���� �ּڰ��� �ִ��� �������� ������ ����Ѵ�.

���� �Է�1 5
		20 10 35 30 7

���� ���1 7 35
/**/
import java.util.Scanner;
public class d01_�ּ��ִ�{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int min = 0, max = 0;
		n = sc.nextInt();
		int num[] = new int[n];
		for(int i =0; i<n; i++) {
			num[i] = sc.nextInt();
		}
			min = num[0];
			max = num[0];
		for(int i =0; i<n; i++) {
			if(min>num[i]) {
				min=num[i];
			}
			if(max<num[i]) {
				max=num[i];
			}
		}
		System.out.println(min + " " + max);
		}
		
}

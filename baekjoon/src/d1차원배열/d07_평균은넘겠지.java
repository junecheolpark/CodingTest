package d1�����迭;

/*/
����� �Ѱ���

����
���л� ��������� 90%�� �ڽ��� �ݿ��� ����� �Ѵ´ٰ� �����Ѵ�. ����� �׵鿡�� ���� ������ �˷���� �Ѵ�.

�Է�
ù° �ٿ��� �׽�Ʈ ���̽��� ���� C�� �־�����.

��° �ٺ��� �� �׽�Ʈ ���̽����� �л��� �� N(1 �� N �� 1000, N�� ����)�� ù ���� �־�����, �̾ N���� ������ �־�����. 
������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�.

���
�� ���̽����� �� �پ� ����� �Ѵ� �л����� ������ �ݿø��Ͽ� �Ҽ��� ��° �ڸ����� ����Ѵ�.

���� �Է�1 5
		5 50 50 70 80 100
		7 100 95 90 80 70 60 50
		3 70 90 80
		3 70 90 81
		9 100 99 98 97 96 95 94 93 91

���� ���1 40.000%
		57.143%
		33.333%
		66.667%
		55.556%
/**/
import java.util.Scanner;
public class d07_������Ѱ��� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr;
		
		//�� �� ����
		int c = sc.nextInt();
		
		
		for(int i =0; i<c; i++) {
			double sum = 0;
			//�л��� ����
			int n = sc.nextInt();
			arr = new int[n];
			//�л� ���� ����
			for(int j=0; j<n; j++) {
				int a = sc.nextInt();
				arr[j] = a;
				sum += a;
			}
			//�л����� ���
			double mean =(sum/n);
			double cnt = 0;
			for(int j=0; j<n; j++) {
				if(arr[j] > mean) {
					cnt++;
				}
				
			}
			
			//printf ����
			/*
			 * System.out.printf("num2(�Ҽ��� ù° �ڸ�����) :%.1f%n",num2);
			 * System.out.printf("num2(�Ҽ��� ��° �ڸ�����) :%.2f%n",num2);
			 */
			System.out.printf("%.3f%%\n",(cnt/n)*100);
			
		}
		
		
	}

}

package g�⺻����1;


/*/
�м�ã��

����
�м����� 1/1 �� 1/2 �� 2/1 �� 3/1 �� 2/2 �� �� �� ���� ������� ������ ���ʴ�� 1��, 2��, 3��, 

4��, 5��, �� �м���� ����.

X�� �־����� ��, X��° �м��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� X(1 �� X �� 10,000,000)�� �־�����.

���
ù° �ٿ� �м��� ����Ѵ�.

���� �Է�1 1

���� ���1 1/1
/**/
import java.util.Scanner;
public class g03_�м�ã�� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
 
		int cross_count = 1, prev_count_sum = 0;
 
		while (true) {
        
			// ���� �밢�� ������ + �ش� �밢�� ���� �̿��� ���� �Ǻ�
			if (X <= prev_count_sum + cross_count) {	
				
				if (cross_count % 2 == 1) {	// �밢���� ������ Ȧ����� 
					// ���ڰ� ū ������ ����
					// ���ڴ� �밢���� ���� �� ���� - (X ��° - ���� �밢�������� �� ���� - 1) 
					// �и�� X ��° - ���� �밢�������� �� ����
					System.out.print((cross_count - (X - prev_count_sum - 1)) + "/" + (X - prev_count_sum));
					break;
				} 
				
				else {	// �밢������ ���� ������ ¦����� 
					// Ȧ���� ���� ����� �ݴ�� 
					System.out.print((X - prev_count_sum) + "/" + (cross_count - (X - prev_count_sum - 1)));
					break;
				}
 
			} else {
				prev_count_sum += cross_count;
				cross_count++;
			}
		}
	}
	}


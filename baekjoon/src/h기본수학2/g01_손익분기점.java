package h�⺻����2;


/*/
�Ҽ� ã��

����
�־��� �� N�� �߿��� �Ҽ��� �� ������ ã�Ƽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
�Է�
ù �ٿ� ���� ���� N�� �־�����. N�� 100�����̴�. �������� N���� ���� �־����µ� ���� 1,000 ������ �ڿ����̴�

���
�־��� ���� �� �Ҽ��� ������ ����Ѵ�.

���� �Է�1 4
		1 3 5 7

���� ���1 3
/**/
import java.util.Scanner;

public class g01_���ͺб��� {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in) ;
		
		int N = in.nextInt();
		
		int count = 0;
		
		for(int i = 0; i < N; i++) {
			
			// �Ҽ��ΰ�� true, �ƴѰ�� false   
			boolean isPrime = true;
			
			int num = in.nextInt();
			
			if(num == 1) {	// 1 �ΰ�� ���� �ݺ�������
				continue;
			}
			for(int j = 2; j <= Math.sqrt(num); j++) {
				if(num % j == 0) {
					isPrime = false;	// �Ҽ��� �ƴϹǷ� false �� �ٲ���
					break;
				}
			}
			if(isPrime) {	// �Ҽ��ΰ�� count �� 1 ����
				count++;
			}
		}
		System.out.println(count);
	}
 
}


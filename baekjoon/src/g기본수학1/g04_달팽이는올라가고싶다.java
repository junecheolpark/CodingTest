package g�⺻����1;


/*/
�����̴� �ö󰡰� �ʹ�

����
�� ���� �����̰� �ִ�. �� �����̴� ���̰� V������ ���� ���븦 �ö� ���̴�.

�����̴� ���� A���� �ö� �� �ִ�. ������, �㿡 ���� �ڴ� ���� B���� �̲�������. ��, ���� �ö� �Ŀ��� �̲������� �ʴ´�.

�����̰� ���� ���븦 ��� �ö󰡷���, ��ĥ�� �ɸ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� �� ���� A, B, V�� �������� ���еǾ �־�����. (1 �� B < A �� V �� 1,000,000,000)

���
ù° �ٿ� �����̰� ���� ���븦 ��� �ö󰡴µ� ��ĥ�� �ɸ����� ����Ѵ�.

���� �Է�1 2 1 5

���� ���1 4
/**/
import java.util.Scanner;
public class g04_�����̴¿ö󰡰�ʹ� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		int up = sc.nextInt();		// A
		int down = sc.nextInt();	// B
		int length = sc.nextInt(); 	// C
 
		int day = (length - down) / (up - down);
        
		// �������� ���� ��� (�ܿ� ���� ���� ���)
		if ((length - down) % (up - down) != 0) {
			day++;
		}
		System.out.println(day);
			
		}
	}


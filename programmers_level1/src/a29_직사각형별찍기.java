import java.util.Scanner;

public class a29_���簢������� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		for (int i = 0; i < b; i++) { // b��ŭ �ݺ�
			for (int j = 0; j < a; j++) { // a��ŭ �ݺ����� *�� a��ŭ���
				System.out.print("*");
			}
			System.out.println(); // ����ĭ���� �̵�
		}

	}
}

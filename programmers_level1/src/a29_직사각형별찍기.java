import java.util.Scanner;

public class a29_직사각형별찍기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		for (int i = 0; i < b; i++) { // b만큼 반복
			for (int j = 0; j < a; j++) { // a만큼 반복시켜 *을 a만큼출력
				System.out.print("*");
			}
			System.out.println(); // 다음칸으로 이동
		}

	}
}

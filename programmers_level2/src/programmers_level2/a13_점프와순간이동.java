package programmers_level2;

//https://school.programmers.co.kr/learn/courses/30/lessons/12980
public class a13_�����ͼ����̵� {
	public static void main(String[] args) {

		System.out.println(solution(5000)); // ���:5
	}

	// ��� 1
	public static int solution(int n) {
		int battery = 0;
		while (n > 0) {
			if (n % 2 == 0) {
				n /= 2;
			} else {
				n--;
				battery++;
			}
		}
		return battery;
	}

}

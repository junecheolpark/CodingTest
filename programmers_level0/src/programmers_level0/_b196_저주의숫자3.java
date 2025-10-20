package programmers_level0;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/120871
 * */

public class _b196_�����Ǽ���3 {
	public static void main(String[] arg) {
		System.out.println((solution(15)));

	}
	// ���ڰ� ������� ���1
	public static int solution(int n) {
		int cnt = 1, num = 1;
		while (cnt < n) {
			num++;
			if (num % 3 == 0 || String.valueOf(num).contains("3")) {
                continue; // 3�� ��� �Ǵ� ���� 3 ���� �� �ǳʶ�
            }
			cnt++; // ��ȿ�� ���ڸ� ī��Ʈ ����
		}
		return num;
	}
	
	// ���� ���ڰ� Ŭ��� ���2
	public static int solution2(int n) {
		int count = 0;
        int num = 0;

        while (count < n) {
            num++;
            int temp = num;
            boolean ok = true;
            while (temp > 0) {
                if (temp % 10 == 3) { // �������� 3�ϰ�� ����
                    ok = false;
                    break;
                }
                temp /= 10; // ������ 10���Ͽ� 3�ϰ�� false (30... 300..)
            }
            if (num % 3 == 0) ok = false;

            if (ok) count++;
        }

        return num;
	}
}

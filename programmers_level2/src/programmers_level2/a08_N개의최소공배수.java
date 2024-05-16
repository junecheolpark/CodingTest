package programmers_level2;

import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/12953
public class a08_N�����ּҰ���� {
	public static void main(String[] args) {
		int[] arr = {2, 6, 8, 14};
        System.out.println(solution(arr)); // ���: 168
	}

	 // �ִ����� ��� �޼���
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // �ּҰ���� ��� �޼���
    public static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }

    
    // �迭�� ��� ���� �ּҰ���� ��� �޼���
    public static int solution(int[] arr) {
    	/**
    	int answer = arr[0];
        for (int i = 1; i < arr.length; i++) {
            answer = lcm(answer, arr[i]);
        }
        */
        return Arrays.stream(arr).reduce(1, (a, b) -> lcm(a, b));
    }

}


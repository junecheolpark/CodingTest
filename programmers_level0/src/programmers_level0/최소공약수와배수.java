package programmers_level0;

import java.util.Arrays;

public class �ּҰ�����͹�� {
	public static void main(String[] args) {

		int num1 = 2;
		int num2 = 3;

		int gcd = getGCD(num1, num2);
		System.out.println("�ִ����� : " + gcd);
		System.out.println("�ּҰ���� : " + (num1 * num2) / gcd);

	}

	public static int getGCD(int num1, int num2) {
	        if (num1 % num2 == 0) {
	            return num2;
	        }
	        return getGCD(num2, num1%num2);
	    }
	
}

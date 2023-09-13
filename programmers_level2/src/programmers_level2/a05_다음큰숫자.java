package programmers_level2;

//https://school.programmers.co.kr/learn/courses/30/lessons/12911
public class a05_����ū���� {
	public static void main(String[] args) {
		System.out.println((way1(15)));
		System.out.println((way1(78)));
	}

	// 2������ ��ȯ�� 1�ǰ��� ����
	public static int way1(int n) {
		String binary = Integer.toBinaryString(n);
		String nextBinary = ""; // 2����

		int num = binary(binary);// n 1����
		int nextNum = 0;

		while (true) { // num ������ nextNum ������ ������ break
			n++;
			nextBinary = (Integer.toBinaryString(n));
			nextNum = binary(nextBinary);
			if (nextNum == num) {
				break;
			}
		}
		return n;
	}

	public static int binary(String binary) {
		int num = 0;
		for (int i = 0; i < binary.length(); i++) {
			if (binary.charAt(i) == '1') {
				num++;
			}
		}
		return num;
	}
	
	// Integer.bitCount(n); �ٷ� 1�ǰ����� �ľ�
	public static int way2(int n) {
		int num = Integer.bitCount(n);// n 1����
		int nextNum = 0;

		while (true) { // num ������ nextNum ������ ������ break
			n++;
			nextNum = Integer.bitCount(n);
			if (nextNum == num) {
				break;
			}
		}
		return n;
	}
	

}

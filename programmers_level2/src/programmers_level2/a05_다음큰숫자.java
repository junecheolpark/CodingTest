package programmers_level2;

//https://school.programmers.co.kr/learn/courses/30/lessons/12911
public class a05_다음큰숫자 {
	public static void main(String[] args) {
		System.out.println((way1(15)));
		System.out.println((way1(78)));
	}

	// 2진수로 변환후 1의개수 구함
	public static int way1(int n) {
		String binary = Integer.toBinaryString(n);
		String nextBinary = ""; // 2진수

		int num = binary(binary);// n 1개수
		int nextNum = 0;

		while (true) { // num 개수와 nextNum 개수가 같으면 break
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
	
	// Integer.bitCount(n); 바로 1의개수를 파악
	public static int way2(int n) {
		int num = Integer.bitCount(n);// n 1개수
		int nextNum = 0;

		while (true) { // num 개수와 nextNum 개수가 같으면 break
			n++;
			nextNum = Integer.bitCount(n);
			if (nextNum == num) {
				break;
			}
		}
		return n;
	}
	

}

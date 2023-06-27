import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/17681

public class a41_크기가작은부분문자열 {
	public static void main(String[] arg) {
		int[] arr = { 9, 20, 28, 18, 11 };
		int[] arr2 = { 30, 1, 21, 17, 28 };
		String[] strArray = solution(5, arr, arr2);
		System.out.println(String.join(",", strArray));
	}

	public static String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		int[] arrNum = decimalToBinary2(n);
		int[][] arrNum2 = new int[n][n];

		for (int i = 0; i < n; i++) {
			int num = arr1[i];
			int num2 = arr2[i];

			for (int j = 0; j < n; j++) {
				if (arrNum[j] <= num && j != n - 1) {
					num -= arrNum[j];
					arrNum2[i][j] = 1;
				} else if (num == 1 && j == n - 1) {
					arrNum2[i][j] = 1;
				}

				if (arrNum[j] <= num2 && j != n - 1) {
					num2 -= arrNum[j];
					arrNum2[i][j] = 1;
				} else if (num2 == 1 && j == n - 1) {
					arrNum2[i][j] = 1;
				}
			}
			// System.out.println(sb.toString());
		}
		for (int i = 0; i < n; i++) {
			//System.out.println("i : " + i);
			answer[i] = "";
			for (int j = 0; j < n; j++) {
				//System.out.print(arrNum2[i][j]);
				answer[i] += arrNum2[i][j] == 1 ? "#" : " ";
			}
			//System.out.println(answer[i]);

		}
		return answer;
	}

	public static int[] decimalToBinary2(int n) {
		int[] arrNum = new int[n];
		int num = 0;
		for (int i = 1; i <= n; i++) {
			if (i == 2) {
				num += 2;
			} else {
				num = num * 2;
			}
			arrNum[n - i] = num;
		}
		return arrNum;
	}

	// 이진법
	public static String decimalToBinary(int decimalNumber) {
		if (decimalNumber == 0) {
			return "0";
		} else if (decimalNumber == 1) {
			return "1";
		} else {
			int quotient = decimalNumber / 2;
			int remainder = decimalNumber % 2;
			System.out.println(quotient + " : " + remainder);
			return decimalToBinary(quotient) + String.valueOf(remainder);
		}
	}
}

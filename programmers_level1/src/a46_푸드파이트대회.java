import java.util.Arrays;
import java.util.HashSet;

//https://school.programmers.co.kr/learn/courses/30/lessons/134240

public class a46_푸드파이트대회 {
	public static void main(String[] arg) {
		int[] array = { 1, 3, 4, 6 };
		System.out.println(solution(array));
	}

	public static String solution(int[] food) {
		int num = 0;
		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		
		for (int i = 1; i < food.length; i++) {
			num = (food[i] % 2) != 0 ? food[i] - 1 : food[i];
			for (int j = 0; j < num / 2; j++) {
				sb.append(i);
				sb2.insert(0, i);
			}
		}
		
		sb.append(0);
		sb.append(sb2);
		return sb.toString();
	}
}

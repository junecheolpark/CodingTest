package programmers_level2;

//https://school.programmers.co.kr/learn/courses/30/lessons/12939

public class a00_최대값과최소값 {
	public static void main(String[] args) {
		System.out.println(solution("1 2 3 4"));
	}

	public static String solution(String s) {
		String[] arr = s.split(" ");
		int num = 0;
		int min = Integer.valueOf(arr[0]);
		int max = min;

		for (int i = 1; i < arr.length; i++) {
			num = Integer.valueOf(arr[i]);
			min = Math.min(min, num);
            max = Math.max(max, num);
		}

		return min + " " + max;
	}

}

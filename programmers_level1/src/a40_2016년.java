import java.time.DayOfWeek;
import java.time.LocalDate;

//https://school.programmers.co.kr/learn/courses/30/lessons/72410

public class a40_2016�� {
	public static void main(String[] arg) {
		String answer = new Solution40().solution(5, 24);
		System.out.println(answer);
	}
}

class Solution40 {

	public String solution(int a, int b) {
		String answer = "";
		 LocalDate date = LocalDate.of(2023, 6, 26); // ��¥ ���� (����, ��, ��)

	        DayOfWeek dayOfWeek = date.getDayOfWeek();
	        
	        System.out.println("2016�� 7�� 1���� " + dayOfWeek.toString().substring(0,3) + "�����Դϴ�.");
		return answer;
	}
}

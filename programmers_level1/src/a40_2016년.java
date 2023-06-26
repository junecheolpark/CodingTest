import java.time.DayOfWeek;
import java.time.LocalDate;

//https://school.programmers.co.kr/learn/courses/30/lessons/72410

public class a40_2016년 {
	public static void main(String[] arg) {
		String answer = new Solution40().solution(5, 24);
		System.out.println(answer);
	}
}

class Solution40 {

	public String solution(int a, int b) {
		String answer = "";
		 LocalDate date = LocalDate.of(2023, 6, 26); // 날짜 설정 (연도, 월, 일)

	        DayOfWeek dayOfWeek = date.getDayOfWeek();
	        
	        System.out.println("2016년 7월 1일은 " + dayOfWeek.toString().substring(0,3) + "요일입니다.");
		return answer;
	}
}

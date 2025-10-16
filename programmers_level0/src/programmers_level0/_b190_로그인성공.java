package programmers_level0;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/120883
 * */

public class _b190_로그인성공 {
	public static void main(String[] arg) {
		System.out.println((solution(new String[] { "meosseugi", "1234" },
				new String[][] { { "rardss", "123" }, { "yyoom", "1234" }, { "meosseugi", "1234" } })));
	}

	public static String solution(String[] id_pw, String[][] db) {
		String inputId = id_pw[0];
		String inputPw = id_pw[1];

		for (String[] account : db) {
			String id = account[0];
			String pw = account[1];

			if (id.equals(inputId)) { // 아이디 일치
				if (pw.equals(inputPw)) {
					return "login"; // 아이디+비밀번호 모두 일치
				} else {
					return "wrong pw"; // 아이디만 일치
				}
			}
		}
		return "fail"; // 아이디 일치하는 계정 없음
	}
}

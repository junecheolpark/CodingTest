package programmers_level0;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/120883
 * */

public class _b190_�α��μ��� {
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

			if (id.equals(inputId)) { // ���̵� ��ġ
				if (pw.equals(inputPw)) {
					return "login"; // ���̵�+��й�ȣ ��� ��ġ
				} else {
					return "wrong pw"; // ���̵� ��ġ
				}
			}
		}
		return "fail"; // ���̵� ��ġ�ϴ� ���� ����
	}
}

//https://school.programmers.co.kr/learn/courses/30/lessons/72410

public class a39_�űԾ��̵���õ {
	public static void main(String[] arg) {
		String answer = new Solution39().solution("abcdefghijklmn.p");
		System.out.println(answer);
	}
}

class Solution39 {

	public String solution(String new_id) {
	    // 1. �ҹ��� ��ȯ
	    String output = new_id.toLowerCase();

	    // 2. ���ĺ� �ҹ���, ����, ����(-), ����(_), ��ħǥ(.)�� ������ ��� ���ڸ� ����
	    output = output.replaceAll("[^a-z0-9-_.]", "");

	    // 3. ��ħǥ(.)�� 2�� �̻� ���ӵ� �κ��� �ϳ��� ��ħǥ(.)�� ġȯ
	    output = output.replaceAll("\\.+", ".");

	    // 4. ��ħǥ(.)�� ó���̳� ���� ��ġ�Ѵٸ� ����
	    output = output.replaceAll("^\\.|\\.$", "");

	    // 5. �� ���ڿ��� ��� "a" ����
	    if (output.isEmpty()) {
	        output = "a";
	    }

	    // 6. ���̰� 16�� �̻��� ���
	    if (output.length() >= 16) {
	        output = output.substring(0, 15); // ù 15�� ���ڸ� ������ ������ ���� ����
	        output = output.replaceAll("\\.$", ""); // ������ ���ڰ� ��ħǥ(.)�� ��� ����
	    }

	    // 7. ���̰� 2�� ������ ���
	    if (output.length() <= 2) {
	        char lastChar = output.charAt(output.length() - 1); // ������ ����
	        while (output.length() < 3) {
	            output += lastChar; // ������ ���ڸ� ���� �߰�
	        }
	    }

	    return output;
	}
}

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class a09_���ڿ���p��y���� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		boolean answer = new Solution9().solution(s);
		System.out.println(answer);

	}
}

class Solution9 {
	 boolean solution(String s) {
		 /*/
		  int yCnt = 0;
		  int pCnt = 0;
		  char[] ch = s.toCharArray(); // String s �� char�� �迭�� ����
		  for(int i = 0; i<s.length(); i++) { 
			  if(ch[i] =='p' || ch[i] == 'P') { //�ϳ��� ��ȸ�� p,P �Ͱ��ٸ� pCnt��
				  pCnt++;
			  }
			  else if(ch[i] =='y' || ch[i] == 'Y') { //�ϳ��� ��ȸ�� y,Y �Ͱ��ٸ� yCnt��
				  yCnt++;
			  }
		  }
		  return yCnt == pCnt; // y������ p������ ���ٸ�
		  /**/
		 int cnt = 0;
		 for (int i = 0; i<s.length(); i++) {
			 if(s.charAt(i) == 'p' || s.charAt(i) == 'P') { // p,P�� ���ٸ� ī��Ʈ ��
				 cnt++;
			 }else  if(s.charAt(i) == 'y' || s.charAt(i) == 'Y') { //y,Y�� ���ٸ� ī��Ʈ �ٿ�
				 cnt--;
			 }
			 
		 }
		 return cnt == 0 ? true : false; // cnt�� 0�̸� true�ƴϸ� false
	}
}


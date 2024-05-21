package programmers_level2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


//https://school.programmers.co.kr/learn/courses/30/lessons/12981
public class a12_영어끝말잇기 {
	public static void main(String[] args) {
		String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"} ;
		String[] words2 = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"} ;
		String[] words3 = {"hello", "one", "even", "never", "now", "world", "draw"} ;

		String str = "tank";
		char firstChar = str.charAt(0);
        System.out.println("첫 번째 문자: " + firstChar);
        // 마지막 문자 출력
        char lastChar = str.charAt(str.length() - 1);
        System.out.println("마지막 문자: " + lastChar);
        
//		System.out.println(Arrays.toString(solution(3, words))); // 출력: 3,3
//		System.out.println(Arrays.toString(solution(5, words2))); // 출력: 0,0
		System.out.println(Arrays.toString(solution(2, words3))); // 출력:1,3 
	}
	
	// 방법 1
	public static int[] solution(int n, String[] words) {
		int[] answer = new int[2];
		int lNum = 0;
		int pNum = 0;

		Set<String> set = new HashSet<>();
		for (int i = 0; i < words.length; i++) {
			if (!set.add(words[i])) { //  Set에 추가할 때 중복되는지 확인
				lNum = i;
				break;
			} else if (i != 0 && words[i - 1].charAt(words[i - 1].length() - 1) != words[i].charAt(0)) { // 이전 끝 문자와 현재 첫문자가 같은지확인
				lNum = i;
				break;
			} else if (words.length - 1 == i) { // 반복문이끝까지 돌면 리턴 {0,0}
				return answer;
			}
		}
		// 순서, 몇번째 순번
		pNum = lNum % n + 1;
		lNum = lNum / n + 1; //(int) Math.ceil((double) (lNum + 1) / n);

		answer[0] = pNum;
		answer[1] = lNum;
		return answer;
	}
	
	// 방법2
	public static int[] souution2(int n, String[] words) {
		int[] answer = new int[2];

		Set<String> set = new HashSet<>();
		char lastChar = words[0].charAt(words[0].length() - 1);
		set.add(words[0]);

		for (int i = 1; i < words.length; i++) {
			// 방법1과 마찬가지로 !set.add(words[i])로 할수있음
			// contains는 배열안에 포함되어있는지
			if (set.contains(words[i]) || words[i].charAt(0) != lastChar) {
				answer[0] = (i % n) + 1;
				answer[1] = (i / n) + 1;
				break;
			} else {
				lastChar = words[i].charAt(words[i].length() - 1);
				set.add(words[i]);
			}
		}

		return answer;
	}

}

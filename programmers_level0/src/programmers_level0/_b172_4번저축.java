package programmers_level0;

import java.util.Scanner;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/250130
 * */

public class _b172_4น๘ภ๚รเ {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int before = sc.nextInt();
        int after = sc.nextInt();

        int money = start;
        int month = 1;
        while (money < 70) {
            money += before;
;
            month++;
        }
        while (money< 100) {
        	 money += after;
             month++;
        }

        System.out.println(month);
	}

}

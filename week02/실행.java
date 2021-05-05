package week02;

import java.util.Scanner;

public class 실행 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 >> ");
		String str = sc.nextLine();
		
		Q1 q1 = new Q1();
		System.out.println(q1.solution(str));
		sc.close();
	}

}

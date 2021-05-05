package week04;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		
		System.out.print("369 숫자를 입력하세요 :");
		//스캐너로 입력받기
		Scanner sc = new Scanner(System.in);
		//엔터를 치기전까지 입력된 데이터들을 string으로 리턴
		String str = sc.nextLine();
		System.out.println(str);
		
		int num = Integer.parseInt(str);
		int count = 0;
		//입력된 숫자 이전까지 박수를 몇번치는지 구하는 것으로 입력숫자보다 작을때까지 반복
		for (int i = 1; i < num; i++) {

			// if문 쓸때 || , && 활용 많이 하기
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == '3') {
					count++;
				}
				else if (str.charAt(j) == '6') {
					count++;
				}
				else if (str.charAt(j) == '9') {
					count++;
				}
			}
			
		}
		System.out.println(count);
		sc.close();
	}//main

}//class

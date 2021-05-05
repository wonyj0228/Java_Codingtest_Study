package week01;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //입력을 화면에서 받겠다!
		
		System.out.print("스트링을 입력해주세요. >> ");
		String str = sc.nextLine();//스트링을 입력받아 변수에 넣겠다.
		String[] str2 = str.split(","); //,를 기준으로 스트링을 나누어 배열에 넣어줌
		// |  << 스플릿 기준을 2개주고싶을 때
		
		int count1 = 0; //사람을 카운트하기 위한 변수
		int count2 = 0; //나는을카운트하기 위한 변수
		int count3 = 0; //너도를 카운트하기 위한 변수
		int count4 = 0; //우리도를 카운트하기 위한 변수
		int count5 = 0; //모두다를 카운트하기 위한 변수
		
		
		//각 문자열을  for문 안에서 마지막 if까지 조건비교를 할 수 있게하기위해 if문을 5번 사용
		for (int i = 0; i < str2.length; i++) {
			if (str2[i].contains("사람")) {
				count1++;
			}
			if (str2[i].contains("나는")) {
				count2++;
			}
			if (str2[i].contains("너도")) {
				count3++;
			}
			if (str2[i].contains("우리도")) {
				count4++;
			}
			if (str2[i].contains("모두다")) {
				count5++;
			}
			
		}
		System.out.println("사람 : " + count1);
		System.out.println("나는 : " + count2);
		System.out.println("너도 : " + count3);
		System.out.println("우리도 : " + count4);
		System.out.println("모두다: " + count5);
		
		sc.close(); //입출력 닫기!
	}

}

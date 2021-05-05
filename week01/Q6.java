package week01;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {

		// 스캐너는 화면 뿐만 아니라 파일로부터 입력도 받을 수 있음
		// system.in은 화면으로부터 입력을 받을 것이라는 뜻
		Scanner sc = new Scanner(System.in); // 생성자 뒤 메서드에 파라메터를 넣지 않으면 오류가 남
		// scanner클래스에 기본생성자가 없기때문에.

		System.out.print("abc개수 세는 프로그램.입력 >> ");
		String str = sc.nextLine(); //스캐너로 string을 입력받는 것 = nextline
		//만약 입력받는 것이 정수면 nextint, 실수면 nextdouble
		
		char[] ch = str.toCharArray(); //입력받은 string을 char로 변환시켜 배열에 넣기
		//tochararray의 반환값은 char의 배열이기때문에 반드시 char의 배열로 받아줘야 한다.
		
		int count1 = 0; //a개수를 세기위한 count1 선언
		int count2 = 0; //b개수를 세기위한 count1 선언
		int count3 = 0; //c개수를 세기위한 count1 선언
		
		for (int i = 0; i < ch.length; i++) { //ch배열의 개수만큼 for문 돌림
			if (ch[i] == 'a') { 
				count1++;
			}else if (ch[i] == 'b') {
				count2++;
			}else if (ch[i] == 'c') {
				count3++;
			}
		}
		System.out.println("결과 >> a(" + count1 + "),b(" + count2 + "),c(" + count3 + ")");
		
		sc.close(); //화면입력의 경우 JVM(Java Virtual Machine)에 의해서 자동으로 관리되기 때문에
		//우리가 닫아줄 필요는 없지만 이클립스가 봤을 때 모든 입출력 관련 객체들은 반드시 사용 후 닫아줘야 하는데 닫아주지 않아서 경고 메세지뜸
		//경고 메세지를 줄이기 위해 close
	}

}

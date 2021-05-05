package week04;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
		System.out.print("국어, 수학, 영어 시험성적을 입력하세요 :");
		//스캐너로 입력받기
		Scanner sc = new Scanner(System.in);
		//엔터를 치기전까지 입력된 데이터들을 string으로 리턴
		String subject = sc.nextLine();
		System.out.println(subject);
		
		//string을 공백기준으로 split해서 배열에 넣어주기
		String[] grade = subject.split(" ");
		
		//점수를 숫자로 형변환해서 넣어줄 배열 선언
		int[] grade2 = new int[3];
		//숫자를 배열에 넣어주기
		for (int i = 0; i < grade.length; i++) {
			grade2[i] = Integer.parseInt(grade[i]);
		}
		
		//점수의 총합을 sum에 for문을 돌려 넣어주기
		int sum = 0;
		for (int i = 0; i < grade2.length; i++) {
			sum += grade2[i];
		}
		
		//round = 소수점 첫째자리에서 반올림
		//강제적으로 100을 곱해 소수점 첫째자리가 셋째자리가 올 수 있게 해서 반올림을 시키고 다시 100을 나누어 원래 상태로 돌리는 것
		double avg = Math.round((double)sum/grade2.length * 100);
		double avg2 = avg/100;
		
		//if문으로 점수가 높은 것부터 출력
		if (avg2 >= 90) {
			System.out.println(avg2 + " A");
		}else if (avg2 >= 80) {
			System.out.println(avg2 + " B");
		}else if (avg2 >= 70) {
			System.out.println(avg2 + " C");
		}else if (avg2 >= 60) {
			System.out.println(avg2 + " D");
		}else {
			System.out.println(avg2 + " F");
		}
		
		sc.close();
		
	}

}

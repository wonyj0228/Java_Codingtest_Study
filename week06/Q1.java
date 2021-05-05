package week06;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// 리그에 속해있는 팀의 수 n
		// 각 팀은 자신을 제외한 모든 팀과 한번씩 경기를 치루어 순위를 가림
		// 스포츠 리그전에서 치루어지는 경기의 수는?
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("모든 팀의 수 입력 :");
		int team = sc.nextInt();
		
		int count = 0;
		for (int i = 1; i < team; i++) {
			count += i;
		}
		System.out.println("모든 경기의 수 : " + count);
		
		sc.close();
		

	}

}

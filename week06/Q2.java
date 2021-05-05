package week06;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// 뱀이 이동할 평면의 크기 n,m이 주어지면 뱀이 이동한 자리를 보여주는 프로그램
		// 뱀이 지나간 자리는 #, 지나가지 않은 자리는 .
		// 3 <= n, 100 >= m
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("평면의 크기 x,y 입력 :");
		String place = sc.nextLine();
		String[] range = place.split(" ");
		int x = Integer.parseInt(range[0]);
		int y = Integer.parseInt(range[1]);
		
		while (x<3 && x>100 && y<3 && y >100) {
			System.out.print("재입력 :");
			place = sc.nextLine();
			range = place.split(" ");
			x = Integer.parseInt(range[0]);
			y = Integer.parseInt(range[1]);
		}
		
		// 2 6 10 14
		// 4 8 12 16
		
			for (int i = 1; i <= y; i++) {
				if (i%2 == 1) {
					String snake = "";
					for (int j = 1; j <= x; j++) {
						snake += "#";
					}
					System.out.println(snake);
				}
				if (i%2 == 0 && i%4 == 2) {
					String snake = "";
					for (int j = 1; j < x; j++) {
						snake += ".";
					}
					snake += "#";
					System.out.println(snake);
				}
				if (i%2 == 0 && i%4 == 0) {
					String snake = "";
					snake += "#";
					for (int j = 1; j < x; j++) {
						snake += ".";
					}
					System.out.println(snake);
				}
				
			}
			sc.close();
		
		
		

	}

}

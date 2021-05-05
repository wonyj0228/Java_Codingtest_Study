package week03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main3 {

	public static void main(String[] args) throws IOException {
		//system.in = 콘솔에서 입력을 받는다.
		//inputstreamreader = 바이트단위 스트림데이터를 문자 단위 스트림데이터로 처리할 수 있도록 변환.
		//bufferedreader = 문자 단위 스트림데이터를 문자열데이터로 처리해줌
		System.out.print("금액을 입력하세요 : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input1 = br.readLine(); //readLine = 데이터 한줄을 읽어서 string으로 꺼내줌(공백포함)
		
		int money = Integer.parseInt(input1);
		int change = 1000 - money;
		
		System.out.println("거스름돈은 : " + change);
		
		int count1 = 0; //500원
		int count2 = 0; //100원
		int count3 = 0; //50원
		int count4 = 0; //10원
		
		if (change >= 500) {
			int a = (int)Math.floor(change/500);
			count1 = a;
			change = change - a*500;
		}
//		System.out.println(change);
//		System.out.println(count1);
		if (change >= 100) {
			int b = (int)Math.floor(change/100);
			count2 = b;
			change = change - b*100;
		}
//		System.out.println(change);
//		System.out.println(count2);
		if (change >= 50) {
			int c = (int)Math.floor(change/50);
			count3 = c;
			change = change - c*50;
		}
//		System.out.println(change);
//		System.out.println(count3);
		if (change >= 10) {
			int d = (int)Math.floor(change/10);
			count4 = d;
			change = change - d*10;
		}
//		System.out.println(change);
//		System.out.println(count4);
		System.out.println(count1 + " " + count2 + " "  + count3 + " " + count4);
		
	}

}


package week03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1 {

	public static void main(String[] args) throws IOException {
		//system.in = 콘솔에서 입력을 받는다.
		//inputstreamreader = 바이트단위 스트림데이터를 문자 단위 스트림데이터로 처리할 수 있도록 변환.
		//bufferedreader = 문자 단위 스트림데이터를 문자열데이터로 처리해줌
		System.out.print("문자열을 입력하세요 : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input1 = br.readLine(); //readLine = 데이터 한줄을 읽어서 string으로 꺼내줌(공백포함)
		
		System.out.print("시작점과 출력할 문자 수를 입력하세요 : ");
		String input2 = br.readLine(); 
		 
		//문자 하나씩 배열로 넣어주기
		char[] inputChar= input1.toCharArray();
		
		//공백기준으로 문자열 split
		String[] numString= input2.split(" ");
		
		//데이터 형변환해서 변수에 넣어주기
		int start = Integer.parseInt(numString[0]);
		int countS = Integer.parseInt(numString[1]);
		
		//출력할 공간 만들어주기
		String line = "";
		//공간에 넣기
		for (int i = start-1; i < start+countS; i++) {
			line = line + inputChar[i];
		}
		System.out.println(line);
	}

}


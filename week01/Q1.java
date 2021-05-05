package week01;

import java.util.HashSet;
import java.util.Random;

public class Q1 {

	public static void main(String[] args) {
		//랜덤숫자 6개를 배열에 넣기
		Random r = new Random();
		int[] NumList = new int[6]; //6개의 숫자를 넣을 배열 생성
		for (int i = 0; i < NumList.length; i++) {
			NumList[i] = 1 + (r.nextInt(45)); //0~44 --> 1~45
		}
		System.out.println(NumList); //배열을 출력하면 주소값
		
		// 숫자를 출력하려면 배열에서 하나씩 꺼내서 출력해야 함
		for (int i = 0; i < NumList.length; i++) {
			System.out.print(NumList[i] + " " );
		}
		
		System.out.println();
		//만약 배열의 중복값을 없앤다면? (개수상관x)
		//컬렉션 중 set형 사용
		HashSet set = new HashSet();
		for (int i = 0; i < NumList.length; i++) {
			set.add(NumList[i]);
		}
		
		System.out.println(set); //set을 출력하면 입력된 값이 보임
		//set의 tostring이 오버라이딩 되어있기 때문임 (주소값 x, 입력값들을 보이게)
		
		
		//배열없이 6개의 중복되지않는 숫자를 set에 넣는다면?
		HashSet set2 = new HashSet();
		while (set2.size() < 6) {
			set2.add(r.nextInt(45) + 1);
		}
		System.out.println(set2);
		
	}//main

}//class

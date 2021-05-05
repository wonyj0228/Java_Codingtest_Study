package week01;

public class Q3 {

	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {  //3단을 100번째까지 보여준다고 가정!
			if (3*i % 4 != 0) { //3*i를 4로 나눈 나머지가 0이면 4의 배수이기 때문에 나머지가 0이 아닌 결과값들을 출력
				System.out.println(3 + "*" + i + "=" + (3*i));
			}
		}
		
		System.out.println("------------------");
		System.out.println("4의 배수만 출력");
		//3단중 4의 배수인 숫자만 출력할 경우
		for (int i = 1; i < 100; i++) { //3*0의 경우의수를 제외하기 위해 1부터 시작
			if (3*i % 4 ==0) {
				System.out.println(3 + "*" + i + "=" + (3*i));
			}
		}
		
	}

}

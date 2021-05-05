package week01;

public class Q4 {

	public static void main(String[] args) {
		
		int[] num = {3,12,45,32,54,22};
		
		//합계
		int sum = 0; //for문 밖에서 sum 선언
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i]; //배열에서 출력한 값들을 sum에 계속해서 더해주기
		}
		System.out.println("배열의 합계는 : " + sum);
		
		
		//평균
		double avg = (double)sum/6; //double로 강제캐스팅해서 평균을 double로 구하기
		//sum/6.0도 가능! 둘중에 하나라도 double이면 결과값은 double.
		System.out.println("배열의 평균은 : " + avg);
		
		//최댓값
		int max = 0; //max값을 0으로 포문 밖에서 선언, 최대값을 구하는 것이기때문에 0으로 선언하는 것이 문제가 되지 않음.
		for (int i = 0; i < num.length; i++) {
			if (max < num[i]) { //배열에서 출력한 값이 max값보다 클 경우
				max = num[i]; //max값을 배열의 출력값으로 변경
			}
		}//출력,변경을 반복해 최대값을 비교헤 골라냄
		System.out.println("배열의 최대값은 : " + max);
		
		//최소값
		int min = num[0]; //배열중에서 최소값이 나와야 하기때문에 0으로 선언하면 안됨.
		for (int i = 0; i < num.length; i++) {
			if (min > num[i]) { //배열의 출력한 값이 min값보다 작을경우
				min = num[i]; //min값을 배열의 출력값으로 변경.
			}
		}//출력,변경을 반복해 최소값을 비교해 골라냄
		System.out.println("배열의 최소값은 : " + min);
		
	}
}

package week05;


class Solution {
    public String solution(int a, int b) {
        
    	// 2016년 1월 1일은 금요일입니다.
		// 2016년 a월 b일은 무슨 요일일까요? 
		// 두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요.
		// 요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT


		/*
		 * 제한 조건 2016년은 윤년입니다. 2016년 a월 b일은 실제로 있는 날입니다. (13월 26일이나 2월 45일같은 날짜는 주어지지
		 * 않습니다)
		 */
		
		
		// 윤년? 1년을 366일로 계산 (2월이 29일까지)
		// 월별 일수
		//31일 : 1,3,5,7,8,10,12
		//30일 : 4,6,9,11
		//29일 : 2
		
    	
    	// 입력데이터 유효성검사
    	String x = "";
    	if (a > 12 | a <= 0) {
			x = "존재하지 않는 달입니다.";
			return x;
		}
    	else if(a == 1 | a == 3 | a == 5 | a == 7 | a == 8 | a == 10 | a == 12) {
			if (b > 31 | b <= 0 ) {
				x = "존재하지 않는 날짜입니다.";
				return x;
			}
		}
    	else if(a == 2) {
			if (b > 29 | b <= 0 ) {
				x = "존재하지 않는 날짜입니다.";
				return x;
			}
		}
    	else {
    		if (b > 30 | b <= 0 ) {
				x = "존재하지 않는 날짜입니다.";
				return x;
			}
		}
    	
    	
    	String[] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
    	
		int sum = 0; //초기화
		for (int i = 1; i < a; i++) {

			if (i == 1 | i == 3 | i == 5 | i == 7 | i == 8 | i == 10 | i == 12) {
				sum += 31;
			}else if (i == 2) {
				sum += 29;
			}else {
				sum += 30;
			}
			
		}
		System.out.println(sum+"일");
		
		// 일 더해주기
		sum = sum + b;
		
		// 요일 구하기
		int Wday = sum%7;
		String answer = day [Wday-1];
        return answer;
		
		
		
		
	}//solution
    
    

}//class

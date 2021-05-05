package week02;

public class Q1 {
	// 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요.
	// 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.
	
	
	public boolean solution(String s) {
		boolean answer = false;  //초기화
		
		if (s.length() == 4 || s.length() ==6) { //s문자열의 길이를 체크해줌
			answer = s.matches("^[0-9]*$");
			//string.matches = 정규식을 이용하여 문자열을 검색
			//한글,숫자 등과 같은 형태의 텍스트가 존재하는지 확인할 때 좋음
			// ^ 표현식 시작
			// $ 표현식 종료
			// * 앞 문자가 없을수도있고 무수히 많을수도 있음
			// [] 문자의 집합이나 범위를 나타냄
			
			// 자주 사용하는 정규표현식은 구글링하면 찾을 수 있음
			// 위에 나와있는 것은 숫자
			
			}
			return answer;
		}
	}
	


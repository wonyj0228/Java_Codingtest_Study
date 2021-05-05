package week05;

public class Solution2 {
	
	public String solution(String new_id) {
		// 아이디의 길이는 3자 이상 15자 이하여야 합니다.
		// 아이디는 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.) 문자만 사용할 수 있습니다.
		// 단, 마침표(.)는 처음과 끝에 사용할 수 없으며 또한 연속으로 사용할 수 없습니다.
		
//		1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
//		2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
//		3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
//		4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
//		5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
//		6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
//		     만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
//		7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
        
		//입력문자
		System.out.println("입력ID : " + new_id);
		
		// 1단계
		String n1 = new_id.toLowerCase();
		System.out.println("1단계 : " + n1);
		
		
		// 2단계
		String n2 = "";
		for (int i = 0; i < n1.length(); i++) {
			char c = n1.charAt(i);
			if (c >= 'a' && c <='z') {  //범위를 알파벳 a부터 z까지
				n2 += c;
			}else if (c >= '0' && c <= '9') { // 범위를 숫자 1부터 9까지
				n2 += c;
			}else if (c == '-' | c == '_' | c == '.') {
				n2 += c;
			}
		}
		System.out.println("2단계 : " + n2);
		
		
		// 3단계
		while (n2.contains("..") == true) {
			n2 = n2.replace("..", ".");
		}
		String n3 = n2;
		System.out.println("3단계 : " + n3);
		
		
		// 4단계
		
		String n4 = "";
		
		if (n3.charAt(0) == '.' && n3.length() >= 1) {
			n3 = n3.replaceFirst(".", "");
		}
		if (n3.length()>=1 && n3.charAt(n3.length()-1) == '.') {
			n3 = n3.substring(0, n3.length()-1);
		}
		n4 = n3;
		System.out.println("4단계 : " + n4);
		
		
		// 5단계
		String n5 = "";
		if (n4.length() == 0) {
			n5 = n4 + "a";
		}else {
			n5 = n4;
		}
		System.out.println("5단계 : " + n5);
		
		
		// 6단계
		String n6 = "";
		if (n5.length()>15) {
			n6 = n5.substring(0, 15);
			if (n6.charAt(14) == '.') {
				n6 = n6.substring(0, 13);
			}
		}else {
			n6 = n5;
		}
		System.out.println("6단계 : " + n6);
		
		// 7단계
		
		if (n6.length()<3) {
			while (n6.length() < 3) {
				n6 = n6 + n6.charAt(n6.length()-1);
			}
		}
		String n7 = n6;
		System.out.println("7단계 : " + n7);
		System.out.println("===========================");
		
		
		String answer = n7;
        return answer;
    }
}

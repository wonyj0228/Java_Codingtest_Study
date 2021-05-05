package week01;

public class Q5 {

	public static void main(String[] args) {
		
		//if문은 코드순서대로 위에서부터 해당된다면 if아래에 해당되는 코드를 실행시키고 나머지는 실행시키지 않음
		//따라서 3의 배수이면서 5의 배수인 경우의수를 출력하는 코드를 제일 위로 올려야 함
		//이어 조건을 입력해주고 
		//숫자를 출력하는 경우의 수는 조건에 해당되지 않는 경우의 수로 else. 즉 제일 밑에 내려야 함
		
		for (int i = 1; i < 101; i++) {
			if (i % 15 == 0) { //3과 5의 최소공배수인 15를 i를 나눴을 때 나머지값이 0이면"짱킹"출력
				System.out.println("짱킹");
			}else if (i % 3 == 0) { //i를 3으로 나눴을때 나머지값이 0인경우 = 3의 배수 , "짱"출력
				System.out.println("짱");
			}else if (i % 5 == 0) { //i를 5로 나눴을때 나머지값이 0인경우 = 3의 배수 , "짱"출력
				System.out.println("킹");
			}else {//위 조건들에 모두 해당되지 않는 숫자들은 그냥 출력
				System.out.println(i);
			}
		}
		

	}

}

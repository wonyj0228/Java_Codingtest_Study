package week01;

public class Q2 {

	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) {// for1
			System.out.println(i + "단");
			for (int j = 1; j <= 9; j++) {// for2
				System.out.print(i + "*" + j + "=" + (i * j) + "  ");

			} // for2
			System.out.println(); // for2가 9번 돌고나면 다음줄로 이동
		} // for1

	}

}

package Day03;
// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

import java.util.Scanner;

public class B11022 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		 
		int c = in.nextInt();
 
		for (int i = 1; i<=c; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			
			System.out.println("Case #" + i + ": " + a+" + "+ b + " = " + (a + b));	
		}
		in.close();
	}
}

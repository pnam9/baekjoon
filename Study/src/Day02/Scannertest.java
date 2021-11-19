package Day02;

import java.util.Scanner;

public class Scannertest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
			
			String a = sc.next();
			int b = sc.nextInt();
			
			sc.close();
			
			System.out.println("String scanner=====> "+a);
			System.out.println("int scanner=====> "+b);
		
	}

}

package Day03;
//* 찍기

import java.util.Scanner;

public class B2439 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		sc.close();
		
		for(int i=1; i<=a; i++) {
			for (int j=a; j>i; j--) {
					System.out.print(" ");
				}
				for(int k=0; k<i; k++) {
					System.out.print("*");
				}
			System.out.println();
		}
	}
}

package Day03;

// 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 
// 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.



import java.util.Scanner;

public class B10871 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int arr[] = new int[a];
		
		for(int i=0; i<a; i++) {
			arr[i] = sc.nextInt();
		}sc.close();
			for(int z=0; z<a; z++) {
				if(arr[z] < b) {
					System.out.print(arr[z] + " ");
			}
		}
	}
}
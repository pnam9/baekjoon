package Day03;
// 역순으로 순자 뽑아내기
import java.util.Scanner;

public class B2742 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		sc.close();
		
		for(int i=a; i>0; i--) {
			System.out.println(i);
		}
	}
}

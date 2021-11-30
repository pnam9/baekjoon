package array;

import java.util.HashSet;
import java.util.Scanner;

// 나머지 구하기
// 배열에 자연수를 추가 하여 해당 자연수 입력받은 정수를 나눌경운 남은값은 구한다 
// ex) 7,14,27,38 각각의 자연수를 정수 3으로 나눈다면 각 배열의 남은 수는 1,2,0,2 이다
// 이중 서로 다른 값이 몇개인지를 구하면 출력값은 2이다. 


public class B3052 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		HashSet<Integer> a = new HashSet<Integer>();
		
		for(int i=0; i<10; i++) {
			a.add(sc.nextInt() %42);
		}
		sc.close();
		
		System.out.println(a.size());
		
	}

}
 
package array;

import java.util.Scanner;

// 숫자의 개수
// 세개의 자연수 a,b,c 가 주어질 때 a*b*c를 계산한 결과에 0부터 9까지 각 숫자가 몇번 쓰였는지 구해라
// ex)  A = 150, B = 266, C = 427 이라면 A × B × C = 150 × 266 × 427 = 17037300 이 되고,
// 		계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.


public class B2577 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		sc.close();
		int value = a*b*c;
		
		String str = Integer.toString(value);
		//System.out.println(str); 산수의 결과값
		
		for(int i=0; i<10; i++) {
			int count=0;
			for(int j=0; j<str.length(); j++) {
				if((str.charAt(j)-'0') == i ) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}

/*
입력값 저장하여 산수처리하여 value 값에 저장
value 값을 스트링타입으로 변환 
for문 요소를 검사 하여 카운트 수 증가
count출력
주의!! charAt사용시 -0,-48연산해야함 아스키코드에 대응하는 문제 나옴

*/
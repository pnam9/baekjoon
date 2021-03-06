package While;

import java.util.Scanner;

// 더하기 사이클
// 26부터 시작한다. 2+6 = 8이다. 새로운 수는 68이다. 6+8 = 14이다. 새로운 수는 84이다.
// 8+4 = 12이다. 새로운 수는 42이다. 4+2 = 6이다. 새로운 수는 26이다.
// 위의 예는 4번만에 원래 수로 돌아올 수 있다. 따라서 26의 사이클의 길이는 4이다.

public class B1110 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		sc.close();
		
		int count = 0; //싸이클 횟수
		int copy = a;
		
		while(true) {
			a = ((a % 10) * 10) + (((a / 10) + (a % 10)) % 10);
			count++;
			
			if(copy == a) {
				break;
			}
		}
		System.out.println(count);
	}
}


/*
 *
 * 26이란 a값을 주어지면 2+6으로 읽어 들이고 값은 8이 된다.
 * 다음으로는 6+8이 되고 값은 14가 된다.
 * 그다음 수는 8+4가 되고 값은 12가 된다.
 * 그다음 수는 4+2가 되고 값은 6이된다
 * 새로운수는 26이 된다 그럼 종료가 되고 사이클수는 총 4개가 된다.
 * a 값을 입력하고 
 * if (a = a)일 경우 break 걸어줘야하고 
 * count ++해줘야할꺼같고 
 * a값을 추출 하여 산수처리후 count++
 * ((a % 10) * 10) --> 10으로 나눈 나머지 값에 10을 곱하면 십의 자릿수
 * (((a / 10) + (a % 10)) % 10) --> a의 십의 자릿수는 나누기 10 을 하면 a가 한 자릿수이면 0, 
 * 									그 외에는 십의 자릿수가 그대로 반환된다.
									그리고 a의 일의 자릿수는 나머지인 % 을 쓰면 된다.
									이 두개를 더한 뒤 10으로 나눈 나머지가
									a의 각 자릿수의 합의 일의 자릿수가 a의 일의 자릿수가 되겠다.
 * break --> count 출력
 * 
 * 
 */
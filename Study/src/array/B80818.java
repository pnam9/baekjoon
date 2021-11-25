package array;


import java.util.Arrays;

//배열을 정하고 그안에 들어있는 값의 최솟값과 최댓값을 출력한다
//ex) 5개 배열안에 1 ~ 10 이있다면 1과 10이 출력

import java.util.Scanner;

public class B80818 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int arr[] = new int[a];
		
		for (int i = 0; i < a; i++) {
			int b = sc.nextInt();
			arr[i] = b;
		}
		sc.close();
		
		System.out.print(Arrays.stream(arr).min().getAsInt() +" "
							+ Arrays.stream(arr).max().getAsInt());
		
	}

}
// Arrays.stream을 이용해서 최솟값 최대값을 뽑았으나 메모리와 처리 시간이 오래걸린다.
// 나중에 다른 방법이 있는지 확인해서 다시 풀어보도록 하겠다.
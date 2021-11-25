package array;
// 9개의 다른 자연수를 배열에 저장하고 저장된 배열값 중 최댓값을 찾고 그 최댓값이 몇번째 수 인지 확인


import java.util.Scanner;

public class B2562 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {sc.nextInt(),sc.nextInt(),sc.nextInt(),
					sc.nextInt(),sc.nextInt(),sc.nextInt(),
					sc.nextInt(),sc.nextInt(),sc.nextInt() };
		
		sc.close();
		
		int count = 0;
		int max = 0;
		int index = 0;
		
		
		for(int value : arr) {
		count++;
		
		if(value > max) {
			max = value;
			index = count;
			}
		}
		System.out.println(max + "\n" + index);
	}
}
/*
 * 9개의 자연수를 담을 배열생성 
 * 최댓값을 구하고 최댓값이 몇번째에 있는지 출력 count
 * index = count 
 * max = value
 */
package Day03;
// 정순으로 숫자 뽑아내기
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2741 {

	public static void main(String[] args)throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= a; i++) {
			br.close();
			System.out.println(i);
		}	
	}
}

//scanner 이용
/*
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();

for(int b=1; b<=a; b++) {
	System.out.println(b);
}
*/

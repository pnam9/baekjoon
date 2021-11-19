package Day02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReadertest {

	public static void main(String[] args)throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String s = bf.readLine();
		int i = Integer.parseInt(bf.readLine());
		
		bf.close();
		
		System.out.println(s);
		System.out.println(i);
	}
}
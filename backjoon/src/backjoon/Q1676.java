package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1676 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		
		// 소인수분해 2 * 5 가 들어간만큼 0 이 뒤에 붙는다
		// 곧 소인수분해 했을 때 5의 제곱수만큼 0이 붙는다.
		int count = 0;
		
		while(n >= 5) {
			count += n / 5;
			n /= 5;
		}
		
		bw.write(count + "");
		
		bw.close();
	}
}
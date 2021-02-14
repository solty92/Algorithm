package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2231 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int inpt = Integer.parseInt(br.readLine());
		
		int M = 0;
		int sum = 0;
		int result = 0;
		
		for (int i = 1; i <= 1000000; i++) {
			M = i;
			sum = M;
			while(M > 0) {
				sum += (M % 10);
				M /= 10;
			}
			if(sum == inpt) {
				result = i;
				break;
			}
		}
		
		bw.write("" + result);
		bw.close();
		
	}
	
}
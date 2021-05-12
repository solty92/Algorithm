package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2748 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		long[] fibo = new long[n+1];
		
		fibo[0] = 0;
		fibo[1] = 1;
		
		for (int idx = 2; idx < fibo.length; idx++) {
			fibo[idx] = fibo[idx - 1] + fibo[idx - 2];
		}
		
		bw.write(fibo[n] + "");
		
		bw.close();
	}

}
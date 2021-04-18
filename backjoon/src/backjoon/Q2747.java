package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2747 {
	
	static int[] fiboArr;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		fiboArr = new int[N+1];
		
		makeFibonacci(N);
		
		bw.write(fiboArr[N] + "");
	
		bw.close();

	}
	
	private static void makeFibonacci(int N) {
		fiboArr[0] = 0;
		fiboArr[1] = 1;
		
		for (int idx = 2; idx < fiboArr.length; idx++) {
			fiboArr[idx] = fiboArr[idx-2] + fiboArr[idx-1];
		}
		
	}

}
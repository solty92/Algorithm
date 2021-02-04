package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Q2581 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		
		if(M <= 1) {
			M = 2;
		}
		
		ArrayList<Integer> primeArray = new ArrayList<Integer>(N-M+1);
		boolean isPrime;
		
		for (int i = M; i <= N; i++) {
			isPrime = true;
			for (int j = 2; j < i; j++) {
				if(i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				primeArray.add(i);
			}
		}
		
		int sum = 0;
		for (int i = 0; i < primeArray.size(); i++) {
			sum += primeArray.get(i);
		}
		
		if(sum != 0) {
			bw.write("" + sum + "\n");
			bw.write("" + primeArray.get(0));
		}else {
			bw.write("-1");
		}
		
		bw.close();
		
	}
	
}
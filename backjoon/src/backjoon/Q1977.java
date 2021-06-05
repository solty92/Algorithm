package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1977 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		
		int psc = 101;
		int sum = 0;
		
		double tmp;
		while(true) {
			psc--;
			tmp = Math.pow(psc, 2);
			
			if(M <= tmp && tmp <= N) {
				sum += tmp;
				
			}
			
			if(tmp < M) {
				psc++;
				break;
			}
			
		}
		
		if(sum == 0) {
			bw.write("-1");
		}else {
			bw.write(sum + "\n");
			bw.write((int) Math.pow(psc, 2) + "");
		}
		
		bw.close();
	}
}
package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1436 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		int i = 665;
		int threeCount = 0;
		while(N > 0) {
			threeCount = 0;
			
			int tmp = ++i;
			
			while(tmp > 0) {
				if((tmp % 10) == 6) {
					threeCount++;
				}else {
					threeCount = 0;
				}
				if(threeCount == 3) break;
				tmp /= 10;
			}
			
			if(threeCount >= 3) N--;
		}
		
		bw.write(i +"");
		bw.close();
	}
}
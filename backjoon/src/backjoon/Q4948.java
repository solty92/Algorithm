package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q4948 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int n=0;
	
		while(true) {
			n = Integer.parseInt(br.readLine());
			if(n == 0) break;
			
			int end = n*2;
			
			int count = 0;
			
			boolean[] numberArray = new boolean[end + 1];
			
			for (int i = n+1; i <= end; i++) {
				numberArray[i]=true;
			}
			
			numberArray[0]=false;
			numberArray[1]=false;
			
			for (int i = 2; i <= Math.sqrt(end); i++) {
				for (int j = 2; j*i <= end; j++) {
					numberArray[j*i] = false;
				}
			}
			
			for (int i = 0; i < numberArray.length; i++) {
				if(numberArray[i] == true) {
					count++;
				}
			}
			bw.write(count +"\n");
		}
		
		bw.close();
		
	}
}
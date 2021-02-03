package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1978 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int testCase = Integer.parseInt(br.readLine());
		
		String[] array = new String[testCase];
		array = br.readLine().split(" ");

		boolean isPrime;
		int count = 0;
		
		
		for (int i = 0; i < array.length; i++) {
			if(Integer.parseInt(array[i]) == 1){
				continue;
			}
			isPrime = true;
			for (int j = 2; j < Integer.parseInt(array[i]); j++) {
				if(Integer.parseInt(array[i]) % j == 0) {
					isPrime = false;
					break;
				}
				
			}
			if(isPrime) {
				count++;
			}
		}
		
		bw.write("" + count);
		
		bw.close();
		
	}
	
}
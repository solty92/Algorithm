package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q9020 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		boolean[] numberArray = new boolean[10001];
		
		for (int i = 2; i < 10001; i++) {
			numberArray[i]=true;
		}
		
		for (int i = 2; i < Math.sqrt(10001); i++) {
			for (int j = 2; j*i < 10001; j++) {
				numberArray[j*i] = false;
			}
		}
		
	
		int testCase = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < testCase; i++) {
			int goldbach = Integer.parseInt(br.readLine());
			
			Loop : for (int j = goldbach/2; j < numberArray.length; j++) {
				for (int j2 = 0; j2 <= goldbach/2; j2++) {
					if(numberArray[j] == true && numberArray[j2] == true && j + j2 == goldbach) {
						bw.write(j2 + " " + j + "\n");
						break Loop;
					}
				}
			}
			
		}
		
		bw.close();
		
	}
}
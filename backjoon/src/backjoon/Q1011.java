package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Q1011 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] minusArray = new int[100000]; //92680
		
		int inc = 1;
		for (int i = 0; i < minusArray.length; i+=2) {
			minusArray[i] = inc++;
		}
		
		inc = 1;
		for (int i = 1; i < minusArray.length; i+=2) {
			minusArray[i] = inc++;
		}
		
		
		int testCase = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		for (int i = 0; i < testCase; i++) {
			st = new StringTokenizer(br.readLine());
			BigInteger x = new BigInteger(st.nextToken());
			BigInteger y = new BigInteger(st.nextToken());
			
			long length = (y.subtract(x)).longValue();
			
			int count = 0;
			for (int j = 0; j < minusArray.length; j++) {
				if(length >= minusArray[j]) {
					length -= minusArray[j];
					count++;
				}else if(length == 0){
					break;
				}else {
					count++;
					break;
				}
			}
			
			bw.write(count + "\n");
			
		}
		
		
		bw.close();
		
	}
	
}
package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1929 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] array = br.readLine().split(" ");
		
		int M = Integer.parseInt(array[0]);
		int N = Integer.parseInt(array[1]);
		
		boolean[] numberArray = new boolean[N+1];
		
		for (int i = M; i <= N; i++) {
			numberArray[i]=true;
		}
		
		numberArray[0]=false;
		numberArray[1]=false;
		
		for (int i = 2; i < Math.sqrt(N); i++) {
			for (int j = 2; j*i <= N; j++) {
				numberArray[j*i] = false;
			}
		}
		
		for (int i = 0; i < numberArray.length; i++) {
			if(numberArray[i] == true) {
				bw.write(i + "\n");
			}
		}
		
		bw.close();
		
	}
}
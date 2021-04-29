package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1003 {
	
	static int validIdx;
	static int[][] arr;
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		arr = new int[41][2];
		
		arr[0][0] = 1;
		arr[0][1] = 0;
		
		arr[1][0] = 0;
		arr[1][1] = 1;
		
		validIdx = 1;
		
		for (int tc = 0; tc < N; tc++) {
			int inpt = Integer.parseInt(br.readLine());
			
			
			fibo(inpt);
			
			bw.write(arr[inpt][0] + " " + arr[inpt][1] + "\n");
		}
		
		bw.close();
	}
	
	private static void fibo(int inpt) {
		
		if(arr[inpt][0] != 0 && arr[inpt][1] != 0) return;
		else {
			
			while(validIdx < inpt) {
				arr[validIdx+1][0] = arr[validIdx][1];
				arr[validIdx+1][1] = arr[validIdx][0] + arr[validIdx][1];
				
				validIdx++;
			}
			
		}
		
	}
}
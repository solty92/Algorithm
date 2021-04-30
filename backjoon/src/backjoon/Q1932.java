package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q1932 {
	
	static int[][] arr;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		
		arr = new int[N+1][N];
		
		StringTokenizer st;
		
		for (int row = 1; row <= N; row++) {
			st = new StringTokenizer(br.readLine());
			
			int idx = 0;
			while(st.hasMoreTokens()) {
				arr[row][idx++] = Integer.parseInt(st.nextToken());
			}
			
		}
		
		makeResult(N, 0);
		
		
		bw.write(arr[1][0] + "");
		
		bw.close();
	}

	private static void makeResult(int row, int idx) {

			
		for (int i = idx; i < row - 1; i++) {
			
			int a = arr[row][i];
			int b = arr[row][i + 1];
			int bigger = a >= b ? a : b;
			
			arr[row-1][i] += bigger;
		}
		
		if(row == 2) return;
		
		makeResult(row - 1, 0);
			
		
	}
	
	
}
package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q1010 {
	
	static int[][] combiArr = new int[30][30];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int tc = Integer.parseInt(br.readLine());
		
		
		StringTokenizer st;
		for (int i = 0; i < tc; i++) {
			st = new StringTokenizer(br.readLine());
			
			int r = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			
			int result = combinatorics(n, r);
			
			bw.write(result + "\n");
		}
		
		bw.close();
	}

	private static int combinatorics(int n, int r) {
		
		if(combiArr[n][r] != 0) return combiArr[n][r];
		
		if(n == r || r == 0) return combiArr[n][r] = 1;
		
		return combiArr[n][r] = combinatorics(n - 1, r - 1) + combinatorics(n - 1, r);
	}
}
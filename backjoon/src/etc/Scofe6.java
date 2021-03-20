package etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Scofe6 {
	
	static int N, M;
	static int[][] store;
	static int[] nArray = {0, 1};
	static int[] mArray = {1, 0};
	static int max = 0;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		store = new int[M][N];
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			
			for (int j = 0; j < N; j++) {
				store[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int up, left, bigger;
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				up = 0;
				left = 0;
				
				if(i-1 >= 0) up = store[i-1][j];
				if(j-1 >= 0) left = store[i][j-1];
				
				bigger = up > left ? up : left;
				
				store[i][j] += bigger;
			}
			
		}
		
		bw.write("" + store[M-1][N-1]);
		
		bw.close();
	}
}
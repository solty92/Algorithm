package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q15649 {
	
	static BufferedWriter bw;
	static int[] arr;
	static boolean[] isUsed;
	
	static int N, M;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[M+1];
		isUsed = new boolean[N+1];
		
		permutation(1);
		
		
	
		bw.close();

	}
	
	private static void permutation(int lvl) throws IOException {
		
		if(lvl > M) {
			
			for(int i = 1; i <= M; i++) {
				bw.write(arr[i] + " ");
			}
			bw.write("\n");
			
			return;
			
		}
		
		for (int i = 1; i <= N; i++) {
			
			if(!isUsed[i]) {
				arr[lvl] = i;
				isUsed[i] = true;
				permutation(lvl + 1);
				isUsed[i] = false;
			}
			
		}
		
	}
}
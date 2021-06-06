package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q2960 {
	
	static boolean[] isErased;
	static int count, K;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		isErased = new boolean[N+1];
		
		count = 0;
		
		int result = 0;
		for (int i = 2; i < isErased.length; i++) {
			
			if(!isErased[i]) {
				result = erasto(i);
			}
			
			if(result != 0) break;
		}
		
		bw.write(result + "");
		
		bw.close();
	}

	private static int erasto(int i) {
		int result = 0;
		
		for (int j = i; j < isErased.length; j+=i) {
			if(isErased[j]) continue;
			
			isErased[j] = true;
			count++;
			
			if(count == K) {
				result = j;
				return result;
			}
			
		}
		
		return result;
	}
}
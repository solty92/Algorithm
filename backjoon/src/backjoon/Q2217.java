package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Q2217 {
	
	static int[] rope;
	static int N, result;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		N = Integer.parseInt(br.readLine());
		
		rope = new int[N];
		
		for (int i = 0; i < N; i++) {
			
			rope[i] = Integer.parseInt(br.readLine());
			
		}
		
		Arrays.sort(rope);
		
		for (int i = 1; i <= N; i++) {
			
			maxWeight(i);
		}
		
		bw.write(result + "");
		
		bw.close();
	}

	private static void maxWeight(int i) {

		int weight = rope[N - i] * i;
		
		result = result < weight ? weight : result;
		
	}
}
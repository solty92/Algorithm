package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q11399 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] queue = new int[N];
		
		for (int i = 0; i < N; i++) {
			queue[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(queue);
		
		for (int i = 1; i < queue.length; i++) {
			queue[i] += queue[i-1];
		}
		
		int count = 0;
		
		for (int i = 0; i < queue.length; i++) {
			count += queue[i];
		}
		bw.write("" + count);
		
		bw.close();
	}

}
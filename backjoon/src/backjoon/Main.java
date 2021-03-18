package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] myCard = new int[N];
		for (int i = 0; i < N; i++) {
			myCard[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(myCard);
		
		int M = Integer.parseInt(br.readLine());
		int[] result = new int[M];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			int tmp = 0;
			int check = Integer.parseInt(st.nextToken());
			
			for (int j = 0; j < N; j++) {
				if(myCard[j] == check) tmp = 1;
			}
			
			result[i] = tmp;
		}

		for(int a : result) {
			bw.write(a + " ");
		}
		
		bw.close();

	}

}
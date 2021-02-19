package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10989 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] inptArray = new int[N];
		int[] countingArray = new int[10001];
		int[] result = new int[N];
		
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			
			inptArray[i] = num;
			countingArray[num] = ++countingArray[num];
		}

		for (int i = 1; i < countingArray.length; i++) {
			countingArray[i] += countingArray[i-1];
		}
		
		
		for (int i = N-1; i >= 0; i--) {
			result[--countingArray[inptArray[i]]] = inptArray[i];
		}

		for (int i = 0; i < result.length; i++) {
			bw.write(result[i] + "\n");
		}
		
		bw.close();
	}
}
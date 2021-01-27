package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q3052 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] residual = new int[42];
		
		for (int i = 0; i < 10; i++) {
			int idx = Integer.parseInt(br.readLine()) % 42;
			residual[idx]++;
		}

		int count=0;
		for (int i = 0; i < residual.length; i++) {
			if(residual[i] != 0) {
				count++;
			}
		}
		bw.write(count+"");
		
		
		bw.flush();
		br.close();
		bw.close();
	}
}
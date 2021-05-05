package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10162 {
	
	static int N;
	static int[] seconds = {300, 60, 10};
	static int[] countArr = {0, 0, 0};
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		N = Integer.parseInt(br.readLine());
		
		if(N % 10 != 0) {
			System.out.println("-1");
			return;
		}

		microwave(0);
		
		for(int a : countArr) {
			bw.write(a + " ");
		}
		
		bw.close();
	}

	private static void microwave(int idx) {

		if( N >= seconds[idx]) {
			countArr[idx] = N / seconds[idx];
			N %= seconds[idx];
		}
		
		if(N == 0) return;
		else microwave(idx + 1);
		
	}

}
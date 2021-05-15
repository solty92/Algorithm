package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1037 {
	
	static int[] divisor;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int divisorCount = Integer.parseInt(br.readLine());
		
		divisor = new int[divisorCount];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < divisorCount; i++) {
			divisor[i] = Integer.parseInt(st.nextToken());
		}
		
		int result = findN(divisor[0] + 1);
		
		bw.write(result + "");
		
		bw.close();
	}

	private static int findN(int number) {
		
		Arrays.sort(divisor);
		
		return divisor[0] * divisor[divisor.length-1];
	}

}
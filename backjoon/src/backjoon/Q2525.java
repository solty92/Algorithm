package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q2525 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int plusM = Integer.parseInt(br.readLine());
		
		H += plusM / 60;
		
		plusM %= 60;
		
		M %= 60;
		
		M += plusM;
		
		if(M > 59) {
			M -= 60;
			H++;
		}
		
		H %= 24;
		
		bw.write(H + " " + M);
		
		bw.close();
	}
}
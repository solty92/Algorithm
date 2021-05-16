package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q2475 {
	
	static int[] divisor;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int serialNumb = 0;
		
		for (int i = 0; i < 5; i++) {
			int number = Integer.parseInt(st.nextToken());
			
			serialNumb += number * number;
			
		}
		
		serialNumb %= 10;
		
		bw.write(serialNumb + "");
		
		bw.close();
	}

}
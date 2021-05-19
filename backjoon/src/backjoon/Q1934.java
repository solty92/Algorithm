package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q1934 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int tc = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		int a, b;
		for (int i = 0; i < tc; i++) {
			st = new StringTokenizer(br.readLine());
			
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			if(a == 1 || b == 1) {
				int bigger = a > b ? a : b;
				bw.write(bigger + "\n");
				continue;
			}
			
			int euclid = gcd(Math.max(a, b), Math.min(a, b));
			
			bw.write(a * b / euclid + "\n");
		}
		
		
		bw.close();
	}

	private static int gcd(int a, int b) {

		while(b != 0) {
			int r = a % b;
			
			a = b;
			b = r;
		}

		return a;
	}
}
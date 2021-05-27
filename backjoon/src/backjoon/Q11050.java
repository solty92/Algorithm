package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q11050 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		
		if(r == 0 || n == r) {
			bw.write(1 + "");
			bw.flush();
			return;
		}else if(r == 1 || n - r == 1) {
			bw.write(n + "");
			bw.flush();
			return;
		}

		r = n - r > r ? r : n - r;
		
		int result = bc(n, r);
		
		bw.write(result + "");
		
		bw.close();
	}

	private static int bc(int n, int r) {

		int result = 1;
		
		for (int i = 0; i < r; i++) {
			result *= n--;
		}
		
		int rr = r;
		for (int i = rr - 1; i > 1; i--) {
			r *= i;
		}
		
		result /= r;
		
		return result;
		
	}

}
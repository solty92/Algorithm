package swExpertAcademy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class SW1217 {
	
	static int N;

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st;
		
		for (int testCase = 1; testCase <= 10; testCase++) {
			br.readLine();
			
			st = new StringTokenizer(br.readLine());
			
			N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			int result = pow(N, M);
			
			bw.write("#" + testCase + " " + result + "\n");
			
		}

		bw.close();
	}
	
	private static int pow(int n, int m) {
		if(m == 0) return 1;
		if(m == 1) return n;
		
		n *= N;
		
		return pow(n, --m);
	}
}
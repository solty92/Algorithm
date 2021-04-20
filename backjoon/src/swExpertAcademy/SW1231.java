package swExpertAcademy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SW1231 {
	
	static char[] arr;
	static StringBuffer sb;
	static int N;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for (int testCase = 1; testCase <= 10; testCase++) {

			N = Integer.parseInt(br.readLine());
			
			arr = new char[N+1];
			sb = new StringBuffer();
			
			for (int node = 1; node <= N; node++) {
				String inpt = br.readLine();
				arr[node] = inpt.split(" ")[1].charAt(0);
			}
			
			circulator(1);
			
			bw.write("#" + testCase + " " + sb + "\n");
			
		}
		
		bw.close();
	}
	
	private static void circulator(int n) {
		
		if(n > N) return;
		
		circulator(n * 2);
		sb.append(arr[n]);
		circulator(n * 2 + 1);
		
		
	}
}
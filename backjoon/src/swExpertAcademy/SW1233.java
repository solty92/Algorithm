package swExpertAcademy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SW1233 {
	
	static char[] arr;
	static int N;
	static boolean isPossible;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for (int testCase = 1; testCase <= 10; testCase++) {

			N = Integer.parseInt(br.readLine());
			
			arr = new char[N+1];
			isPossible = true;
			
			for (int node = 1; node <= N; node++) {
				String inpt = br.readLine();
				arr[node] = inpt.split(" ")[1].charAt(0);
			}
			
			circulator(1);
			
			int result = isPossible ? 1 : 0;
			
			bw.write("#" + testCase + " " + result + "\n");
			
		}
		
		bw.close();
	}
	
	private static void circulator(int n) {
		
		if(n > N) return;
		
		if(n*2 <= N && n*2+1 <= N) {
			char tmp = arr[n];
			if(!(tmp == '-' || tmp == '+' || tmp == '*' || tmp == '/')) {
				isPossible = false;
			}
		}
		
		if(!isPossible) return;
		
		circulator(n * 2);
		circulator(n * 2 + 1);
		
		
	}
}
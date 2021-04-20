package swExpertAcademy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SW1232 {
	
	static String[] arr;
	static int[][] edgeArr;
	static int N;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for (int testCase = 1; testCase <= 10; testCase++) {

			N = Integer.parseInt(br.readLine());
			
			arr = new String[N+1];
			edgeArr = new int[N+1][2];
			
			for (int node = 1; node <= N; node++) {
				String[] inpt = br.readLine().split(" ");
				arr[node] = inpt[1];
				
				if(inpt.length >= 4) {
					edgeArr[node][0] = Integer.parseInt(inpt[2]);
					edgeArr[node][1] = Integer.parseInt(inpt[3]);
				}
			}
			
			int result = circulator(1, 0);
			
			bw.write("#" + testCase + " " + result + "\n");
			
		}
		
		bw.close();
	}
	
	private static int circulator(int n, int result) {
		
		if(edgeArr[n][0] != 0) {
			int a = circulator(edgeArr[n][0], result);
			int b = circulator(edgeArr[n][1], result);
			
			if(arr[n].equals("+")) {
				result = a + b;
			}else if(arr[n].equals("-")) {
				result = a - b;
			}else if(arr[n].equals("*")) {
				result = a * b;
			}else {
				result = a / b;
			}
			
		}else {
			return Integer.parseInt(arr[n]);
		}
		
		return result;
		
	}
}
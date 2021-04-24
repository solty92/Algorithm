package swExpertAcademy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class SW1256 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		for (int testCase = 1; testCase <= N; testCase++) {
			
			int order = Integer.parseInt(br.readLine());
			
			StringBuffer sb = new StringBuffer(br.readLine());
			String[] arr = new String[sb.length()]; 
			
			int idx = 0;
			while(sb.length() >= 1) {
				arr[idx++] = sb.toString();
				sb.deleteCharAt(0);
			}
			
			Arrays.sort(arr);

			bw.write("#" + testCase + " " + arr[order-1] + "\n");
			
		}
		
		bw.close();
	}
}
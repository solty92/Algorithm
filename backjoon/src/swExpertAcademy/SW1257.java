package swExpertAcademy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;

public class SW1257 {
	
	static HashSet<String> hs;
	static String inpt;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		for (int testCase = 1; testCase <= N; testCase++) {
			
			int order = Integer.parseInt(br.readLine());
			
			inpt = br.readLine();
			hs = new HashSet<String>();
			
			for (int i = 1; i <= inpt.length(); i++) {
				partition(i);
			}
			
			String[] arr = new String[hs.size()];
			
			int idx = 0;
			for(String a : hs) {
				arr[idx++] = a;
			}
			
			Arrays.sort(arr);
			
			if(arr.length + 1 < order) bw.write("#" + testCase + "none\n");
			else bw.write("#" + testCase + " " + arr[--order] + "\n");
			
		}
		
		bw.close();
	}
	
	private static void partition(int n) {
		
		for (int i = 0; i <= inpt.length() - n; i++) {
			hs.add(inpt.substring(i, i+n));
		}
		
	}
	
}
package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1439 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		char[] arr = br.readLine().toCharArray();
		
		int aGroupCount = 1;
		int bGroupCount = 0;
		
		boolean isAGroup = true;
		
		for (int i = 1; i < arr.length; i++) {
			
			if(arr[i-1] == arr[i]) {
				continue;
			}else {
				isAGroup = !isAGroup;
			}
			
			if(isAGroup) aGroupCount++;
			else bGroupCount++;
			
		}
		
		int result = aGroupCount < bGroupCount ? aGroupCount : bGroupCount;
		
		bw.write(result + "");
		
		bw.close();
	}
}
package swExpertAcademy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SW1213 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringBuffer sb;
		
		for (int testCase = 1; testCase <= 10; testCase++) {
			br.readLine();
			String find = br.readLine();
			
			sb = new StringBuffer(br.readLine());
			
			int count = 0;
			int result = 1;
			while(result != -1) {
				
				result = sb.lastIndexOf(find);
				
				if(result != -1) {
					
					sb.delete(result, sb.length());
					count++;
				}
			}
			
			bw.write("#" + testCase + " " + count + "\n");
			
		}
		
		bw.close();
	}
}
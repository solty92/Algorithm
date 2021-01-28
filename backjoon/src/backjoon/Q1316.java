package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1316 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int testCase = Integer.parseInt(br.readLine());
		
		int count = 0;
		for (int i = 0; i < testCase; i++) {
			String word = br.readLine();
			
			if(groupWordChecker(word)) {
				count++;
			}
			
		}
		bw.write(count+"");
		
		bw.flush();
		bw.close();
		
	}
	
	public static boolean groupWordChecker(String s) {
		
		for (int i = 97; i < 123; i++) {
			int firstIndex = s.indexOf((char)i);
			int lastIndex = s.lastIndexOf((char)i);
			
			if(firstIndex != -1 && lastIndex - firstIndex > 1) {
				for (int j = firstIndex+1; j < lastIndex; j++) {
					if(s.charAt(j) != (char)i) {
						return false;
					}//end if
				}//end for
			}//end if
			
		}
		
		return true;
	}
	
}
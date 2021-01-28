package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2941 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String inpt = br.readLine();
		
		StringBuffer str = new StringBuffer(inpt);
		
		String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		for (int i = 0; i < croatia.length; i++) {
			int startIndex = str.indexOf(croatia[i]);
			if(str.indexOf(croatia[i]) != -1){
				if(i == 2) {
					str.delete(startIndex, startIndex+3);
					str.insert(startIndex, " ");
				}else {
					str.delete(startIndex, startIndex+2);
					str.insert(startIndex, " ");
				}
				i--;
			}
		}
		int result = str.length();
		bw.write("" + result);
		
		
		bw.flush();
		bw.close();
		
	}
	
}
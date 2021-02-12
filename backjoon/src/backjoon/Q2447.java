package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2447 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int inpt = Integer.parseInt(br.readLine());
		int count = 3;
		
		String[][] result = new String[inpt][inpt];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(i == 1 & j == 1) result[i][j] = " ";
				else result[i][j] = "*";
			}
		}
		
		if(inpt == 3) {
			for (int i = 0; i < inpt; i++) {
				for (int j = 0; j < inpt; j++) {
					bw.write(result[i][j]);
				}bw.newLine();
			}
		}else {
			while(count < inpt) {
				
				for (int i = 0; i < count; i++) {
					for (int j = 0; j < count; j++) {
						String tmp = result[i][j];
						result[i][j+count]= tmp;
						result[i][j+(count*2)]= tmp;
						result[i+count][j] = tmp;
						result[i+(count*2)][j] = tmp;
						
						result[i+count][j+(count*2)] = tmp;
						result[i+(count*2)][j+count] = tmp;
						result[i+(count*2)][j+(count*2)] = tmp;
					}
				}
				
				for (int i = count; i < count*3 - count; i++) {
					for (int j = count; j < count*3 - count; j++) {
						result[i][j] = " ";
					}
				}
				
				
				count *= 3;
			}
			for (int i = 0; i < inpt; i++) {
				for (int j = 0; j < inpt; j++) {
					bw.write("" + result[i][j]);
				}bw.newLine();
			}
		}
		
		
		
		
		bw.close();
		
	}
	
}
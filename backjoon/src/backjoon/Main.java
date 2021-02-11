package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String array1 = "***";
		String array2 = "* *";
		
		int inpt = Integer.parseInt(br.readLine());
		int times = inpt/3;
		
		if(inpt == 3) {
			bw.write(array1 + "\n");
			bw.write(array2 + "\n");
			bw.write(array1);
		}else {
			for (int j = 0; j < times; j++) {
				
				for (int i = 0; i < times; i++) {
					bw.write(array1);
				}bw.newLine();
				for (int i = 0; i < times; i++) {
					bw.write(array2);
				}bw.newLine();
				for (int i = 0; i < times; i++) {
					bw.write(array1);
				}bw.newLine();
			}
		}
		
		
		
		
		bw.close();
		
	}
	
}
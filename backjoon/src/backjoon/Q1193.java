package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1193 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int inpt = Integer.parseInt(br.readLine());
		
		int i = 1;
		
		int lastNumber = 0;
		
		int division = 0;
		
		int denom = 1;
		int numer = 1;
		
		while(lastNumber < inpt) {
			
			lastNumber += i++;
			
			division++;
		}
		
		int differ = lastNumber-inpt;
		
		if(division % 2 == 0) {
			numer = division;
			for (int j = 0; j < differ; j++) {
				numer--;
				denom++;
			}
		}else {
			denom = division;
			for (int j = 0; j < differ; j++) {
				denom--;
				numer++;
			}
		}
		
		bw.write(numer + "/" + denom);
		bw.flush();
		bw.close();
		
	}
	
}
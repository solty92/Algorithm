package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q4344 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int testCase = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < testCase; i++) {
			String tmp = br.readLine();
			String[] score = tmp.split(" ");
			
			double total = 0;
			
			for (int j = 1; j < score.length; j++) {
				total += Integer.parseInt(score[j]);
			}
			double avg = total/Integer.parseInt(score[0]);
			
			int overAvg=0;
			for (int j = 1; j < score.length; j++) {
				if(Double.parseDouble(score[j])>avg) {
					overAvg++;
				}
			}
			
			double result = overAvg/Double.parseDouble(score[0])*100;
			bw.write(String.format("%.3f", Math.round(result*1000)/1000.0)+"%\n");
		
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}